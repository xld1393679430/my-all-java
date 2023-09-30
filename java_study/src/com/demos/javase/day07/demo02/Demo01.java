package com.demos.javase.day07.demo02;

import java.util.Scanner;

/**
 * next(): 获取输入的一行字符串（该方法不会获取回车符）
 * nextLine(): 获取输入的一行字符串（该方法会获取回车符）
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine方法会接收回车符，如果只输入回车符，那么也会被nextLine()方法扫描到 并返回str1字符串
        System.out.println("请输入...");
        String str1 = sc.nextLine();
        System.out.println("你输入的是：" + str1);

        System.out.println("请输入...");
        String str2 = sc.next();
        System.out.println("你输入的是：" + str2);
    }
}
