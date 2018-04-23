package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Luisdany Pernillo
 */
@Slf4j
@RestController
public class UserController {


    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    //@RequestMapping("/users")
    @GetMapping("/users")
    public Set<User> getUsers(){
        log.debug("executing getusers");
        return userService.getUsers();
    }

    //public Set<User> getUsers(@RequestParam(value="id", defaultValue = "1") Long id){

}
