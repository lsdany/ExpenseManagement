package com.ldapps.expensemanagement.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * @author luisdany pernillo
 * @date 2018-04-07
 *
 * User entity
 *
 */
@Getter
@Setter
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private BigDecimal salary;

    @OneToOne
    private Balance balance;

    //@OneToMany
    //private Set<Discount> discounts;

}
