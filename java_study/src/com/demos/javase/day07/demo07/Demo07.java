package com.demos.javase.day07.demo07;

import java.util.Random;

/**
 * 需求：提供一个名称数组，程序随机抽取一个名称；
 */
public class Demo07 {
    public static void main(String[] args) {
        String[] list = new String[]{
                "精忠报国：岳飞",
                "海疆英魂：邓世昌",
                "抗倭英雄：戚继光",
                "虎门销烟：林则徐"
        };

        Random random = new Random();
        int index = random.nextInt(4);

        System.out.println("随身抽取得是：" + list[index]);
    }
}
