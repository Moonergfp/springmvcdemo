package com.demo.aop;

/**
 * 切面类，aop用它来增强其他类的方法的
 */
public class PointCutClazz {
    /**
     * 增强的方法
     */
    public void invokeMethod(){
        System.out.println("====invoke method===");
    }
}
