package com.ventoss.boot.config;

/**
 * Date:2022/7/26
 * Author:Vent
 * Description:
 **/

import ch.qos.logback.classic.db.DBHelper;
import com.ventoss.boot.bean.Pet;
import com.ventoss.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 *
 *
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
@ConditionalOnMissingBean(name = "tom")
@ImportResource("classpath:bean.xml")
public class MyConfig {

    @Bean
    public User user01(){
        User zhangsan = new User("zhangsan", 11);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

}
