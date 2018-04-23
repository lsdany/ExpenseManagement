package com.ldapps.expensemanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author luisdany pernillo
 * @date
 */
@Entity
@Getter
@Setter
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Boolean applied;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="USER_ID")
    //private User user;
}
