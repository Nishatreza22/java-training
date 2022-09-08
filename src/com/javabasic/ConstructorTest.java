package com.javabasic;

public class ConstructorTest {

    public static void main(String[] args) {

        Human human = new Human("Nishat Reza",25, "New York");
        Human human1 = new Human("Sharmin Akhter", 22, "New York");
        Human human2 = new Human("Ahyan Saadat", 3, "Selden");
        Human human3 = new Human("Aryan Sawaab", 3, "Selden");

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.location);

        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.location);

        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.location);

        System.out.println(human3.name);
        System.out.println(human3.age);
        System.out.println(human3.location);

        human1.eat();



    }

}
