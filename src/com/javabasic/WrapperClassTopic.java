package com.javabasic;

public class WrapperClassTopic {

    //1.Primitive
    //2.Non-Primitive/ Reference Type Data/ Object Type Data

    //Primitive Type                                            //Wrapper Type
        //byte                                                      //Byte
        //int                                                       //Integer
        //short                                                     //Short
        //long                                                      //Long
        //float                                                     //Float
        //double                                                    //Double
        //char                                                      //Char
        //boolean                                                   //Boolean
    //***


    public static void main(String[] args) {
        int a = 5;

        Integer b = 5;
        System.out.println(b);

        System.out.println("50" + "60");
        System.out.println(Integer.parseInt("125") + Integer.parseInt("75"));
        System.out.println(Float.parseFloat("115.25756587678") - Float.parseFloat("104.65354576854"));
        System.out.println(Double.parseDouble("125.7545653555657454") + Double.parseDouble("124.65554525576547"));
    }

}
