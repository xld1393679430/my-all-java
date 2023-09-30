package com.demos.javase.day08.demo01;

import java.util.Arrays;

/**
 * Object类
 * 1,Object类是Java语言中的根类，即所有类的父类
 */
public class Demo01 {

    public static void main(String[] args) {
        Object list = new int[] {1, 2, 3};
        System.out.println("list => " + list.toString());
        System.out.println("list => " + Arrays.toString((int[]) list));

        Object num = 1;
        System.out.println("num = " + num);
    }
}
