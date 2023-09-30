package com.demos.javase.day07.demo01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个scanner扫描枪
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个布尔类型：");
        boolean boo = sc.nextBoolean();
        System.out.println("你输入的布尔值是：" + boo);

        System.out.println("请输入一个double值：");
        double db = sc.nextDouble();
        System.out.println("你输入的double值是：" + db);

        System.out.println("请输入一个int值: ");
        int i = sc.nextInt();
        System.out.println("你输入的int值是：" + i);

        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        System.out.println("您输入的字符串是: " + str);
    }
}
