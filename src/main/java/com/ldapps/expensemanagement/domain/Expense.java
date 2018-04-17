package com.ldapps.expensemanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author luisdany pernillo
 * @date 2018-04-14
 */
@Entity
@Getter
@Setter
public class Expense {

    private Long id;
    private String name;
    private String description;
    private BigDecimal amount;
    private LocalDateTime date;


}
