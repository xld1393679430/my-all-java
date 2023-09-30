package com.demos.javase.day04.demo02;

public class Demo02 {
    public static void main(String[] args) {
        Student s1 = new Student("aa", "01");

        log(s1);
    }

    public static void log(Student stu) {
        System.out.println("我叫" + stu.name + "; 我的学号是" + stu.stuId);
    }
}
