package com.demo.controller;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by guofeipeng on 16/1/9.
 */
@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/method")
    public String method(HttpServletRequest request, HttpServletResponse response,String order_id, String userName) throws IOException {
        String url = request.getRequestURL().toString();
        System.out.println("url===>"+ url);
        boolean s =true;
        if(s){
            response.encodeRedirectURL(url);
            response.sendRedirect("/aop_test/test");
        }
        return "index";
    }








}
