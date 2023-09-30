package com.demos.javase.day07.demo06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 需求：使用键盘录入随机数的最大值，以及需要生成的随机数个数，使用循环随机生成指定个数的随机数；
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.print("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        System.out.print("请输入您要生成的随机数个数: ");
        int count = sc.nextInt();

        Random random = new Random();
        ArrayList list = new ArrayList();
        for(int i = 0; i < count; i++) {
            int num = random.nextInt(max);
            list.add(num);
        }
        System.out.print("随机数分别是：" + list);
    }
}
