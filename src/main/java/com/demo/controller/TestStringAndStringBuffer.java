package com.demo.controller;

public class TestStringAndStringBuffer {

    public static void main(String []args) {



        String s1 = new StringBuilder("why").append("true").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("why").append("true").toString();
        System.out.println(s2.intern() == s2);

        String s3 = new StringBuilder("why").append("true").toString();
        System.out.println(s3.intern() == s1);



    }

    private static String withStrings(int count) {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += i;
        }

        return s;
    }

    private static String withStringBuffer(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }

        return sb.toString();
    }





}
