package com.ventoss.boot;

import com.ventoss.boot.bean.Pet;
import com.ventoss.boot.bean.User;
import com.ventoss.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Date:2022/7/26
 * Author:Vent
 * Description:
 **/
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.ventoss.boot")
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);


        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);
        System.out.println("hehe："+hehe);

        // Pet tom01 = run.getBean("tom", Pet.class);
        //
        // Pet tom02 = run.getBean("tom", Pet.class);
        //
        // System.out.println("组件："+(tom01 == tom02));
        //
        //
        // //4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$51f1e1ca@1654a892
        // MyConfig bean = run.getBean(MyConfig.class);
        // System.out.println(bean);
        //
        // User user = bean.user01();
        // User user1 = bean.user01();
        // System.out.println(user == user1);
        //
        //
        // User user01 = run.getBean("user01", User.class);
        // Pet tom = run.getBean("tom", Pet.class);
        //
        // System.out.println("用户的宠物："+(user01.getPet() == tom));

    }
}
