package com.sram.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
