package com.ventoss.boot.bean;

// import lombok.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户
 */

@NoArgsConstructor
//@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User() {
    }

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

}
