package com.oop.abstraction;

public abstract class FlyingCar {

    //regular methode/non abstract method

    public void engine(){
        System.out.println("Flying car has Rolls Royce engine");
    }

    //abstract methode
    public abstract void body();
    public abstract void color();
    public abstract void wheels();



}
