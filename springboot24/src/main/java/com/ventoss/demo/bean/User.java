package com.ventoss.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Date:2022/8/4
 * Author:Vent
 * Description:
 **/
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_user")
public class User {
    private String userName;
    private String password;


    //
    private Integer id;
    // private String name;
    private Integer age;
    private String sex;
    private String email;
    // private String email;


}
