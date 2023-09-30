package com.demos.javase.day04.demo01;

public class Demo01 {
    public static void main(String[] args) {
       Student stu = new Student();
       stu.study();
    }


}

class Student{
    // 成员属性
    String name;
    int age;

    // 成员方法
    public void study() {
        System.out.println("xx 在学习ing");
    }

}
