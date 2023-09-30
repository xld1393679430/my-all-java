package com.demos.javase.day07.demo04;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入一个数，求0到这个数之间的偶数个数；
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("键盘录入一个数，求0到这个数之间的偶数个数.");
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个数：");
        int input = sc.nextInt();
        ArrayList list = new ArrayList();
        int count = 0;
        for (int i = 2; i < input; i += 2) {
            count++;
            list.add(i);
        }
        System.out.print("0到" + input + "之间的偶数个数一共有：" + count + "个；分别是" + list);

    }
}
