package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.Expense;
import com.ldapps.expensemanagement.services.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-22
 */
@RestController
public class ExpenseController {

    ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    /**
     * Entrega el listado de gastos en general
     * @return
     */
    @GetMapping("/expenses")
    public Set<Expense> getExpenses(){
        Set<Expense> expenses = expenseService.getExpenses();
        return expenses;
    }

    @PostMapping("expenses")
    public void createExpense(Expense expense){
        expenseService.saveExpense(expense);
    }
}
