package com.javabasic;

public class IfEalseDemo {

    // if
    // if else
    // if elseif else - nested

    public static void main(String[] args) {


//       int a = 10;
//        int b = 5;
//
//        if (a > b) {
//            System.out.println("Today is Tuesday");
//        } else {
//            System.out.println("Today is Wednesday");
//        }
//

        String userName = "Nishat";
        String password = "123456";

//        if ((userName == "Nishat") && (password =="12345")) {
//
//            System.out.println("Open the browser");
//
//        } else {
//            System.out.println("Wrong Entry");
//
//        }


        //  Modern Way


        String result = ((userName == "Nishat") && (password == "12345")) ? "Good To Go" : "Wrong Entry";
        {
            System.out.println(result);

            int time = 10;

            if (time > 12) {
                System.out.println("Good Afternoon");
            } else if (time < 8) {
                System.out.println("Good Morning");
            } else {
                System.out.println("Good Day");


            }



        }

    }


}











