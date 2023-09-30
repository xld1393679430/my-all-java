package com.demos.javase.day06.demo01;

/**
 * 接口语法
 * 1,抽象方法：使用 abstract 关键字修饰，可以省略，没有方法体。该方法供子类实现使用
 * 2,接口中默认方法的default修饰符不可省略，这点和我们之前学习的权限修饰符不一样
 */
public class Demo01 {
    public static void main(String[] args) {
        Student stu = new Student("张三");

        stu.run();
    }
}

class Student implements Person {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "Student run");
    }
}

interface Person {
    String name = null;

    public abstract void run();

    // 等价上面的写法
    // void run();

}

