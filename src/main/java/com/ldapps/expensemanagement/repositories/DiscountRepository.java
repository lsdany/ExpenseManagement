package com.ldapps.expensemanagement.repositories;

import com.ldapps.expensemanagement.domain.Discount;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany pernillo
 */
public interface DiscountRepository extends CrudRepository<Discount, Long> {
}
