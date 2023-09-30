package com.demos.javase.day07.demo10;

/**
 * Math类
 */
public class Demo10 {
    public static void main(String[] args) {

        // 取绝对值
        int abs = Math.abs(-20);
        System.out.println("-20的绝对值是：" + abs);

        // 向上取整
        double ceil = Math.ceil(30.2);
        System.out.println("30.2向上取整是：" + ceil);

        // 向下取整
        double floor = Math.floor(28.9);
        System.out.println("28.9向下取整是：" + floor);

        // 四舍五入
        long r1 = Math.round(20.5);
        System.out.println("20.5四舍五入是：" + r1);

        // 生产0-1的随机数
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }
    }
}
