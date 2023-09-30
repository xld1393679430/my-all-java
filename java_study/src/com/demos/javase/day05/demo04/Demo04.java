package com.demos.javase.day05.demo04;

public class Demo04 {
    public static void main(String[] args) {
        // final修饰的变量（成员变量或局部变量）只能被赋值一次；因此被final修饰的变量我们称为常量，通常全大写命名；
        final double PI = 3.14;
    }

    // 错误 被final修饰的变量只能被赋值一次
    // public void fn() {
    //    this.PI = 2;
    // }
}

// 错误,被final修饰的类不能被继承。
//class Student1 extends Person1 {}

// 错误 final修饰的方法不能被子类重写；
//class Student2 extends Person2 {
//    public void fn() {
//        System.out.println("Student2 fn");
//    }
//}
