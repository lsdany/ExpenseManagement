package com.ldapps.expensemanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Balance {

    private Long id;
    private BigDecimal balance;


}
