package com.demo.controller;

public class TestJvm {

    public static void main(String[] args){
//        List<String> ls = Lists.newArrayList();
//
//        int i = 0 ;
//        while(true){
//            System.out.println("add..");
//           ls.add(String.valueOf(i++).intern());
//        }

//        String str1 = new StringBuffer("计算机").append("软件").toString();
//        String str1 = new StringBuffer("hello").append("world").toString();
//        System.out.println(str1.intern() == str1);
//
//        String str2 = new StringBuffer("ja").append("va").toString();
//        System.out.println(str2.intern() == str2);

        String s1 = new String("1");
        s1.intern();
        String s2 = "1";
        System.out.println( s1 == s2);



        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";

        System.out.println(s3 == s4);
    }
}
