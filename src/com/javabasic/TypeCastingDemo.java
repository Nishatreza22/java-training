package com.javabasic;

public class TypeCastingDemo {

    public static void main(String[] args) {

        /* Widening Casting (Automatically) - byte>short>char>int>long>float>double
           Narrowing Casting (Manually) - double>float>long>int>char>short>byte

         */

            int a = 10;
            double b = a;
        System.out.println("Widening Casting: " + b);


            double x = 5.000;
            int y = (int)x;
        System.out.println("Narrowing Casting: " + y);





    }

}
