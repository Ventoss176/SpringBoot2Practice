package com.ventoss.demo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ventoss.demo.bean.User;
import com.ventoss.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;


    @GetMapping("/basic_table")
    public String basic_table(
            // @RequestParam("a")int a
                                        ) {
        // int b = 10/0;
        return "table/basic_table";
    }



    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                Model model){
        Page<User> page = new Page<>(pn,2);

        Page<User> page1 = userService.page(page, null);

        model.addAttribute("users", page1);

        return "table/dynamic_table";
    }


    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
