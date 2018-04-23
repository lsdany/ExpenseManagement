package com.ldapps.expensemanagement.services;

import com.ldapps.expensemanagement.domain.Balance;

import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-21
 */
public interface BalanceService {

    Set<Balance> getBalance();

    Balance findById(Long id);

    void deleteById(Long id);

    void saveBalance(Balance balance);

}
