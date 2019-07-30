package com.neudeu.Demo;

public class Test {
    public static void main(String[] args) {
        Man man = new Man("张三",18,"绿色","big");
        Woman woman = new Woman("李四",18,"big");
        System.out.println(man.getAge());
        System.out.println(man.getMuscle());
        System.out.println(woman.getName());
        System.out.println(woman.getChest());
        man.a = 15;
        System.out.println(man.a);
    }

}