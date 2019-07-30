package com.neudeu.Demo;

public class Man extends Person {
    private String hairColor;
    private String muscle;

    public Man(String hairColor, String muscle) {
        this.hairColor = hairColor;
        this.muscle = muscle;
    }

    public Man(String name, int age, String hairColor, String muscle) {
        super(name, age);
        this.hairColor = hairColor;
        this.muscle = muscle;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    @Override
    public int eat() {
        return 0;
    }
}
