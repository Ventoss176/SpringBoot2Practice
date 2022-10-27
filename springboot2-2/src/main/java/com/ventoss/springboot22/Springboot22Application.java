package com.ventoss.springboot22;

import com.ventoss.springboot22.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot22Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot22Application.class, args);
        Person bean = run.getBean(Person.class);

        System.out.println(bean);
    }

}
