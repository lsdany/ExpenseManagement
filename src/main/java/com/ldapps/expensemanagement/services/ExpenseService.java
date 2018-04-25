package com.ldapps.expensemanagement.services;

import com.ldapps.expensemanagement.domain.Expense;

import java.util.Set;


/**
 * @author luisdany pernillo
 * @date 2018-04-21
 */
public interface ExpenseService {


    Set<Expense> getExpenses();

    Expense findById(Long id);

    void deleteById(Long id);

    Expense saveExpense(Expense expense);

    Expense updateExpense(Expense expense);

}
