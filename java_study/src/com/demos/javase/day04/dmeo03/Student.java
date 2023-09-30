package com.demos.javase.day04.dmeo03;

public class Student {
    // 通过static存储 通过new创建了多少个学生
    static int total = 0;

    int sid = 0;

    String name = "a";

    public Student(String name) {
        total++;

        this.sid = total;
        this.name = name;
    }

    public void show() {
        System.out.println("我是" + this.name + "; 我的sid是" + this.sid + "; 累计创建了" + this.total + "个学生");
    }

    public static void fn1() {
        System.out.println("1，我是Student类中的静态方法 fn1，请通过Student.fn1调用 \n" +
                "2, 静态方法可以直接静态类和其他静态方法。比如： total是" + Student.total + "\n" +
                "3，静态方法中不能访问普通成员变量或者方法，不能使用this关键字");
    }

    public static void fn2() {
        System.out.println("我是Student类中的静态方法 fn2，请通过Student.fn2调用. 其中total是" + Student.total);
    }
}
