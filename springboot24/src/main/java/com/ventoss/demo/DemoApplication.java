package com.ventoss.demo;

import com.ventoss.demo.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    EmpServiceImpl empServiceImpl;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }

}
