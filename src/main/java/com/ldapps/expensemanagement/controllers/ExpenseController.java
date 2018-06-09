package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.Expense;
import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.ExpenseService;
import com.ldapps.expensemanagement.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-22
 */
@RestController
@RequestMapping("/api")
public class ExpenseController {

    ExpenseService expenseService;

    UserService userService;

    public ExpenseController(ExpenseService expenseService, UserService userService){
        this.expenseService = expenseService;
        this.userService = userService;
    }

    /**
     * Entrega el listado de gastos en general
     * @return
     */
    @GetMapping("/expenses/")
    public Set<Expense> getExpenses(){
        Set<Expense> expenses = expenseService.getExpenses();
        return expenses;
    }


    @RequestMapping(value = "/expenses",  method = RequestMethod.POST)
    public @ResponseBody Expense createExpense(@RequestParam("id") Long id, @RequestBody Expense expense) {

        User user = userService.findById(id);
        expense.setUser(user);

        return expenseService.saveExpense(expense);
    }

    @PutMapping

    /**
     * TODO recursive problem
     * @param id
     * @return
     */
    @GetMapping("/expenses/{id}/expense")
    public Expense getExpenseById(@PathVariable Long id){

        System.out.println("valor del id " + id);

        Expense expense = expenseService.findById(id);

        System.out.println("Valor de expense "+ expense.toString());

        return expense;
//        return null;
    }


}
