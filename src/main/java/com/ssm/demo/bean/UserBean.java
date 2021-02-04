package com.ssm.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserBean {
    private String id;
    private String name;
    private int age;
    private String password;
    private String account;
}
