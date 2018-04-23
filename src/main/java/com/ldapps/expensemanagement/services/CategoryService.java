package com.ldapps.expensemanagement.services;

import com.ldapps.expensemanagement.domain.Category;

import java.util.Set;

public interface CategoryService {

    Set<Category> getCategory();

    Category findById(Long id);

    void deleteById(Long id);

    void saveUser(Category category);

}
