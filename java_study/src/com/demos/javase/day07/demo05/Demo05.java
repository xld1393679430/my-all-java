package com.demos.javase.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成5个10以内的随机数
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("生成5个10以内的随机数");
        ArrayList list = new ArrayList();

        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            int s = random.nextInt(10);
            list.add(s);
        }

        System.out.println("生成的5个随机数是" + list);
    }
}
