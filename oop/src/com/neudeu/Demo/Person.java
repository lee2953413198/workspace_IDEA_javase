package com.neudeu.Demo;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.age=18;
        this.name="张三";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void display(){
        System.out.println(age);
        System.out.println(name);
    }
}
