package com.ldapps.expensemanagement.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author luisdany pernillo
 * @date 2018-04-14
 */
@Entity
@Data
@EqualsAndHashCode(exclude = "user")
public class Expense implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal amount;

    //@JsonFormat(pattern="yyyy-MM-dd")
//    @DateTimeFormat(iso = DateTimeFormatter.ISO_LOCAL_DATE_TIME)
//    @CreatedDate
    //private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    @JsonBackReference
    private User user;

    //private Category category;


}
