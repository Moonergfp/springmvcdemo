package com.demo.controller;

/**
 * 多线程申请栈空间,每个线程的栈空间越大,线程数越少
 * VM args -Xss1024M
 */
public class TestStack {

    public static void main(String[] args) {

        TestStack testStack = new TestStack();
        try {
            testStack.test2();
        } catch (Throwable e) {
            throw e;
        }
    }

    class MultiThred extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public void test2() {
        MultiThred t = new MultiThred();
        t.start();
        test2();
    }

}
