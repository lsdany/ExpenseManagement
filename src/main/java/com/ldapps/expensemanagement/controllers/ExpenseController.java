package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.Expense;
import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.ExpenseService;
import com.ldapps.expensemanagement.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
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

    @PostMapping("/expenses")
    //public @ResponseBody Expense createExpense(@Valid @RequestBody Expense expense, @RequestParam Long id){
    public Expense createExpense(@ModelAttribute Expense expense, @RequestParam("id") Long id){
        System.out.println("en create: objeto: "+expense.toString());
        System.out.println("id: "+id);

//        expense.setId(null);

        //User user = userService.findById(id);
        //expense.setUser(user);

        System.out.println("------------"+expense.toString());

        return null; //expenseService.saveExpense(expense);
    }


    @RequestMapping(value = "/e",  method = RequestMethod.POST)
    public @ResponseBody Expense test(@RequestParam("id") Long id, @RequestBody Expense expense) {


        System.out.println("en create: objeto: "+expense.toString());
        System.out.println("id: "+id);

        User user = userService.findById(id);
        expense.setUser(user);

        //System.out.println(expense.toString());

        return expenseService.saveExpense(expense);
    }


//    @RequestMapping(value = "/expenses/", method = RequestMethod.POST, consumes = "multipart/form-data" ,
//            produces = { "application/json", "application/xml" })
//    public Expense postPaiment(@RequestBody Expense expense, @RequestParam Long id) {
//
//        User user = userService.findById(id);
//        expense.setUser(user);
//        return expenseService.saveExpense(expense);
//    }

//    @PutMapping("")
//    public Expense updateExpense(){
//        return null;
//    }
}
