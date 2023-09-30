package com.demos.javase.day09.demo01;

public class Computer {
    double price = 2000;

    public class CPU {
        int core;
        double price  = 3000;

        public void run() {
            double price = 4000;
            System.out.println("价值" + price + "的电脑的CPU正在运行");

            System.out.println("外部类的price：" + Computer.this.price);
            System.out.println("内部类的price：" + this.price);
            System.out.println("方法中的price：" + price);
        }
    }
}
