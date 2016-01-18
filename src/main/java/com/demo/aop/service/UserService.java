package com.demo.aop.service;

import org.springframework.stereotype.Service;

/**
 * 普通的service
 */
@Service
public class UserService {
    public void insert(){
        System.out.println("====insert into tb_user====");
    }
}
