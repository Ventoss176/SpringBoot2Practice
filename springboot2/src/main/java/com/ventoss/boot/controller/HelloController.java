package com.ventoss.boot.controller;

import com.ventoss.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:2022/7/26
 * Author:Vent
 * Description:
 **/
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/hello")
    public String hand01(){
        return "hello spring boot 2";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }



}
