package com.oop.inheritance.hirarchical;

public class MainTest {

    public static void main(String[] args) {

        John john = new John();
        john.religion();
        john.shape();
        john.engineer();
        System.out.println("--------------------------------");


        Alex alex = new Alex();
        alex.religion();
        alex.shape();
        alex.cricketer();
        System.out.println("---------------------------------");


        Mario mario = new Mario();
        mario.religion();
        mario.shape();
        mario.technition();
        System.out.println("---------------------------------");

    }
}
