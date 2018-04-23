package com.ldapps.expensemanagement.repositories;

import com.ldapps.expensemanagement.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany pernillo
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
