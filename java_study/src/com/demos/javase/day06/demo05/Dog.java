package com.demos.javase.day06.demo05;

/**
 * 狗类
 */
public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "狗吃骨头");
    }

    public void sleep() {
        System.out.println(this.name + "狗趴着睡");
    }
}
