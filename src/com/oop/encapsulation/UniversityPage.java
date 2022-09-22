package com.oop.encapsulation;

public class UniversityPage {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Student Name :" + " " + ("Nishat Reza"));
        student.setAge(25);
        student.setDob("8/22/1997");
        student.setSsn(717524692);
       // System.out.println(student.getName());
       // System.out.println(student.getAge());
       // System.out.println(student.getDob());
       // System.out.println(student.getSsn());


        //Another Print command
        System.out.println(
            "Student Name : " + student.getName() + "," + "\n" +
            "Student Age : " + student.getAge() + "," + "\n" +
            "Student DOB : " + student.getDob() + "," + "\n" +
            "Student SSN : " + student.getSsn());

    }


}
