package com.ventoss.springboot22.controller;

import com.ventoss.springboot22.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:2022/7/28
 * Author:Vent
 * Description:
 **/
@RestController
public class MyController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }

}
