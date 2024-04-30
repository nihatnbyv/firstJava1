package myPackage;

import Lesson7.Human;

public class HumanApp {
    public int age;
    public String name;

    HumanApp(int age){
        this.age = age;
    }

    HumanApp(String name) {
        this.name = name;
    }

    HumanApp(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        HumanApp Nihat = new HumanApp(25, "Nihat");
        System.out.println(Nihat.age + Nihat.name);

    }

}
