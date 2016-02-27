package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guofeipeng on 16/1/9.
 */
@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/method")
    public String method(String order_id,String userName){
        System.out.println("abc===>"+order_id);
        System.out.println("userName===>"+userName);
        return "index";
    }
}
