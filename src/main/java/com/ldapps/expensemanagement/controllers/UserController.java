package com.ldapps.expensemanagement.controllers;

import com.ldapps.expensemanagement.domain.User;
import com.ldapps.expensemanagement.services.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author Luisdany Pernillo
 */
@RestController
@Slf4j
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    /**
     * Getting the information of all the users
     * @return
     */
    @GetMapping("/users/")
    public Set<User> getUsers(){
        log.debug("executing getusers");
        return userService.getUsers();
    }

    @PostMapping("/users/")
    public User createUser(@RequestBody User user){
        log.debug("user "+user.toString());
        return userService.saveUser(user);

    }

    @PutMapping ("/users/")
    public User updateUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}/user")
    public User getUserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}/user")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }


}
