package com.ldapps.expensemanagement.servicesImpl;

import com.ldapps.expensemanagement.domain.Expense;
import com.ldapps.expensemanagement.repositories.ExpenseRepository;
import com.ldapps.expensemanagement.services.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository){
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
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void saveExpense(Expense expense) {

    }
}

