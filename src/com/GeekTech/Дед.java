package com.GeekTech;

public class Дед {
    private int age;
    private String name;
    private Должность должность;

    public Дед(int age, String name, Должность должность) {
        this.age = age;
        this.name = name;
        this.должность = должность;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    public Должность getДолжность() {
        return должность;
    }
}
