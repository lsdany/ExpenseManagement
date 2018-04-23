package com.ldapps.expensemanagement.services;

import com.ldapps.expensemanagement.domain.Discount;

import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-21
 */
public interface DiscountService {

    Set<Discount> getDiscount();

    Discount findById(Long id);

    void deleteById(Long id);

    void saveDiscount(Discount discount);


}
