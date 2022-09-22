package com.oop.inheritance.hybrid;

import java.sql.SQLOutput;

public class Human extends Robert implements Alex, John {
    @Override
    public void engineer() {
        System.out.println("Alex is an engineer");
    }

    @Override
    public void fishing() {
        System.out.println("Alex likes fishing");
    }

    @Override
    public void eat() {
        System.out.println("Alex eats pizza everyday");
    }

    @Override
    public void cricketer() {
        System.out.println("John is a cricketer");
    }

    @Override
    public void car() {
        System.out.println("John likes sports car");
    }

    @Override
    public void gym() {
        System.out.println("John goes to gym everyday");
    }
}
