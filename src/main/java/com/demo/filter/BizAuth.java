package com.demo.filter;

import com.demo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.*;
import java.io.IOException;

/**
 * Created by guofeipeng on 16/1/10.
 */
@Service
public class BizAuth implements Filter {

    @Resource
    private HelloService helloService;
    private String appKey;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======init====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("====filter=");
        helloService.test();
        System.out.println("appkey===>" + appKey);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("=======destory====");
    }
}
