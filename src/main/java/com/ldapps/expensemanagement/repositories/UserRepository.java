package com.ldapps.expensemanagement.repositories;

import com.ldapps.expensemanagement.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany pernillo
 * @date 2018-04-07
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
