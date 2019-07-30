package com.neudeu.Demo;

public abstract class Person {
    private String name;
    private int age;
    static int a = 12;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract int eat();
}
