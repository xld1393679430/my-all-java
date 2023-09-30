package com.demos.javase.day06.demo03;

/**
 * 接口中，有多个抽象方法时，实现类必须重写所有抽象方法。如果抽象方法有重名的，只需要重写一次
 */
public class Demo03 {
    public static void main(String[] args) {
        Person p = new Person();

        p.fn(); // 抽象方法有重名的，只需要重写一次
        p.eat();
        p.study();

    }
}

class Person implements A, B {

    @Override
    public void fn() {
        System.out.println("Person fn");
    }

    @Override
    public void eat() {
        System.out.println("Person eat");
    }

    @Override
    public void study() {
        System.out.println("Person study");
    }
}

interface A {
    public abstract void fn();

    public abstract void study();
}

interface B {
    public abstract void fn();

    public abstract void eat();
}
