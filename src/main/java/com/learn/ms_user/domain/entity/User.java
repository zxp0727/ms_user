package com.learn.ms_user.domain.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName User
 * @Description 用户实体
 * @Author ZhouXiaoPing
 * @Date 2020/1/3 15:25
 **/
@Table (name = "user")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private BigDecimal money;
    @Column
    private String role;
    @Column
    private Date regTime;
}
