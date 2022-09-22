package com.oop.inheritance.multiple;

public class Human implements Alex, Mario {


    @Override
    public void engineer() {
        System.out.println("Alex is an engineer");


    }

    @Override
    public void fishing() {
        System.out.println("Alex likes fishing");
    }

    @Override
    public void cricketer() {
        System.out.println("Mario is a cricketer");

    }

    @Override
    public void car() {
        System.out.println("Mario likes sports car");

    }
}
