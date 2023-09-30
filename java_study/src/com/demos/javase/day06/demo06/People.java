package com.demos.javase.day06.demo06;

public abstract class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void log() {
        System.out.println("姓名: " + name + ",年龄: " + age);
    }

    public abstract void travel(Travel travel);
}
