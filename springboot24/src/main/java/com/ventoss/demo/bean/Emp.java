package com.ventoss.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Date:2022/8/11
 * Author:Vent
 * Description:
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Emp {
    private Integer eid;

    private String empName;

    private Integer age;

    private String sex;

    private String email;

    private Integer did;


}
