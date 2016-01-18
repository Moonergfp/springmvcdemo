package com.demo.controller;

import com.demo.aop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/aop_test")
public class TestAop {
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String testAop(){
        userService.insert();
        return "aoptest";
    }
}
