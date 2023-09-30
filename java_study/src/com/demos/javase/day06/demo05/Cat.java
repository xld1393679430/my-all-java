package com.demos.javase.day06.demo05;

/**
 * 猫类
 */
public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + "猫吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + "猫趴着睡");
    }
}
