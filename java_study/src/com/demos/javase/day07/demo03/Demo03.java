package com.demos.javase.day07.demo03;

import java.util.Scanner;

/**
 * 键盘录入三个数，打印其最大值
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println("键盘录入三个数，打印其最大值.");
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        int a = sc.nextInt();

        System.out.print("请输入第二个数：");
        int b = sc.nextInt();

        System.out.print("请输入第三个数：");
        int c = sc.nextInt();

        int max = a;
        if (a > b) {
            max = a > c ? a : c;
        } else {
            max = b > c ? b : c;
        }
        System.out.println("你输入的三个数的最大数是：" + max);
    }
}
