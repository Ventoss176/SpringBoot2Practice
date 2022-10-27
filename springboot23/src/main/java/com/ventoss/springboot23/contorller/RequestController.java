package com.ventoss.springboot23.contorller;


import org.omg.CORBA.INTERNAL;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg", "成功");
        request.setAttribute("code", 200);
        return "forward:/success";
    }

    @GetMapping("/params")
    public String testParam(Map<String, Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("maphello", "world 123");
        model.addAttribute("modelhello","model 123");
        request.setAttribute("reqhello", "req 123");
        Cookie cookie = new Cookie("c1", "v1");
        response.addCookie(cookie);
        return "forward:/success";


    }

    @ResponseBody
    @GetMapping("/success")
    public Map successs(@RequestAttribute(value = "msg", required = false) String msg,
                        @RequestAttribute(value = "code", required = false)Integer code,
                        HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        Object maphello = request.getAttribute("maphello");
        Object modelhello = request.getAttribute("modelhello");
        Object reqhello = request.getAttribute("reqhello");

        map.put("maphello",maphello);
        map.put("modelhello",modelhello);
        map.put("reqhello",reqhello);

        return map;
    }


}
