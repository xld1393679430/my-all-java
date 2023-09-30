package com.demos.javase.day05.demo01;


public class Demo01 {
    public static void main(String[] args) {
        Coder c = new Coder("小明");
        c.eat();
        c.coding();

        c.setNum(10);
        System.out.println(c.getNum());

        c.run();

        System.out.println(c.cname);
    }
}

class Coder extends Person {
    public Coder(String name) {
        super(name);
    }

    public void coding() {
        System.out.println(name + "敲代码");
    }

    // 该run方法会重写（覆盖）Person类中的run方法
    public void run() {
        System.out.println("Coder:" + name + "在奔跑");
    }
}
