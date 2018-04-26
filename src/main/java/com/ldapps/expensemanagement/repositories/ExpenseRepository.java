package com.ldapps.expensemanagement.repositories;

import com.ldapps.expensemanagement.domain.Expense;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany pernillo
 */
public interface ExpenseRepository extends CrudRepository<Expense, Long> {

}
