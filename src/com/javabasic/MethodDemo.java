package com.javabasic;

public class MethodDemo {

    //method/functions 2 types : 1. void & 2. return

    //void method

     int time = 8;

    public void reminder(){
        if (time == 9){
            System.out.println("Go to bed");
        } else {
            System.out.println("Have your dinner");
        }
    }

    public void helloAlex(){
        System.out.println("Hi Im Alex.");
    }
    public void helloMario(){
        System.out.println("Hi this is Mario. Im 35 Years old.");
    }
    public void helloGustavo(){
        System.out.println("Its Gustavo, living in long island.");
    }

    // return method
    public String goodMorning(){
        return "Hello Good Morning. Today is August 10th 2022 ";
    }
    public int calculation(){
        return 150+100-50;
    }

    public double add(){
        return 25.4525 + 15.6535;

    }
    public boolean compare(){
        return 25<23;
    }

}
