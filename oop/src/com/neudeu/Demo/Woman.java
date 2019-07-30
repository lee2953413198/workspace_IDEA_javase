package com.neudeu.Demo;

public class Woman extends Person {
    private String chest;


    public Woman(String chest) {
        this.chest = chest;
    }

    public Woman(String name, int age, String chest) {
        super(name, age);
        this.chest = chest;
    }
    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    @Override
    public int eat() {
        return 0;
    }
}
