package com.demos.javase.day07.demo08;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求：使用Scanner录入一个数，再使用Random随机生成一个数与之对比，系统提示大了或者小了，直到玩家猜中，游戏结束。
 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.print("请输入一个20以内数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("循环生成随机数中....(生成的随机数大于你输入的数即退出)");

        while (true) {
            Random random = new Random();
            int randomNum = random.nextInt(20) + 1; // 随机生成1-20的数字

            if (randomNum > num) {
                System.out.println("您输入的是： " + num + ";系统生成的是： " + randomNum + "---大了！！");
            } else if (randomNum < num) {
                System.out.println("您输入的是： " + num + ";系统生成的是： " + randomNum + "---小了！！");
            } else {
                System.out.println("您输入的是： " + num + ";系统生成的是： " + randomNum + "---恭喜你答对了！！");
                break;
            }
        }

    }
}
