package com.ldapps.expensemanagement.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author luisdany pernillo
 * @date 2018-04-14
 */
@Entity
@Getter
@Setter
@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(exclude = "user")
public class Expense implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal amount;

//    @JsonFormat(pattern="yyyy-MM-dd")
//    @CreatedDate
//    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    @JsonBackReference
    private User user;

    //private Category category;


}
