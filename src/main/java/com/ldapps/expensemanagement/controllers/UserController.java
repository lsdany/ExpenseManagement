package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public Set<User> getUsers(){
        log.debug("executing getusers");
        return userService.getUsers();
    }

    //public Set<User> getUsers(@RequestParam(value="id", defaultValue = "1") Long id){

}
