package com.oop.abstraction;

public class MeslaCar extends FlyingCar{


    @Override
    public void body() {
        System.out.println("Mesla Car body looks like Eagle");
    }

    @Override
    public void color() {
        System.out.println("Mesla Car color will be sonic grey");

    }

    @Override
    public void wheels() {
        System.out.println("Mesla Car wheels will be sports trim");

    }
}





