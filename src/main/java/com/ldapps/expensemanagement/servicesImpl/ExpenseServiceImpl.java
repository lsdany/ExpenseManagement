package com.ldapps.expensemanagement.servicesImpl;

import com.ldapps.expensemanagement.domain.Expense;
import com.ldapps.expensemanagement.repositories.ExpenseRepository;
import com.ldapps.expensemanagement.repositories.UserRepository;
import com.ldapps.expensemanagement.services.ExpenseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepository expenseRepository;
    private UserRepository userRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository, UserRepository userRepository){

        this.userRepository = userRepository;
        this.expenseRepository = expenseRepository;
    }


    @Override
    public Set<Expense> getExpenses() {
        Set<Expense> expenses = new HashSet<>();
        expenseRepository.findAll().iterator().forEachRemaining(expenses :: add);
        return expenses;
    }

    @Override
    public Expense findById(Long id) {

        Optional<Expense> expenseOptional = expenseRepository.findById(id);

        if(!expenseOptional.isPresent()){
            throw new RuntimeException("Expense not found!");
        }

        return expenseOptional.get();
    }

    @Override
    public void deleteById(Long id) {

    }

    /**
     * Para guardar un gasto, cada vez que se agregue un nuevo gasto
     * se debitara automaticamente del balance
     * @param expense
     * @return
     */
    @Override
    @Transactional
    public Expense saveExpense(Expense expense) {

        BigDecimal balance_ = expense.getUser().getBalance();
        balance_ = balance_.subtract(expense.getAmount());

        expense.getUser().setBalance(balance_);

        userRepository.save(expense.getUser());
        return expenseRepository.save(expense);
    }

    @Override
    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

}

