package com.demo.sitemesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guofeipeng on 15/11/23.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/method")
    public String method(){
        return "index";
    }
}
