package com.ldapps.expensemanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author luisdany pernillo
 * @date 2018-04-14
 */
@Entity
@Getter
@Setter
public class Category {

    enum PRIORITY{
        LOW, MEDIUM, HIGH
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private PRIORITY priority;
}
