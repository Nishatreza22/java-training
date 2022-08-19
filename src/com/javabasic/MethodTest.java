package com.javabasic;

import java.sql.SQLOutput;

public class MethodTest {

    public static void main(String[] args) {

        MethodDemo methodDemo = new MethodDemo();
        methodDemo.helloGustavo();
        methodDemo.helloMario();
        methodDemo.helloAlex();
        methodDemo.reminder();


        System.out.println(methodDemo.goodMorning());
        System.out.println(methodDemo.calculation());
        System.out.println(methodDemo.add());
        System.out.println(methodDemo.compare());

    }



}