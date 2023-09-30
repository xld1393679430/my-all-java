package com.demos.javase.day05.demo01;

public class Person {

    // 被static修饰的成员是可以被继承到子类的
    static String cname = "cname";

    String name;
    int age;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // num属性不可以被继承 但是可以通过getNum/setNum进行获取
    private int num;

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "在吃放");
    }

    public void run() {
        System.out.println("Person:" + name + "在奔跑");
    }
}
