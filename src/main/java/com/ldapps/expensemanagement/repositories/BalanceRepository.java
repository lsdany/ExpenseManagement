package com.ldapps.expensemanagement.repositories;

import com.ldapps.expensemanagement.domain.Balance;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany pernillo
 */
public interface BalanceRepository extends CrudRepository<Balance, Long> {
}
