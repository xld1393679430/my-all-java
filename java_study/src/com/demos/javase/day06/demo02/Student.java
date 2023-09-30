package com.demos.javase.day06.demo02;

/**
 * 学生类, 是一个人, 并且会游泳
 */
public class Student extends Person implements Swimmable {
    public Student(String name, int age) {
        super(name, age);
    }


    // 实现 Swimmable 的抽象方法
    @Override
    public void swim() {
        System.out.println(this.getName() + "Student swim");
    }

    public void study() {
        System.out.println(this.getName() + "Student study");
    }
}
