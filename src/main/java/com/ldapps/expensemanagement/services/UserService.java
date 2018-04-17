package com.ldapps.expensemanagement.services;

import com.ldapps.expensemanagement.domain.User;

import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-07
 */
public interface UserService {

    Set<User> getUsers();

    User findById(Long id);

    void deleteById(Long id);

    void saveUser(User user);

}
