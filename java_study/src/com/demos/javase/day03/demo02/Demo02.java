package com.demos.javase.day03.demo02;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组的定义
 */
public class Demo02 {
    public static void main(String[] args) {
        Demo_A();

        Demo_B();

        Demo_C();

        int[] arr = getArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     *  1, 动态初始化，只指定数组的长度，由系统为数组的每个元素分配初始值；
     *  tips：数组的长度一旦指定，不能更改
     */
    public static void Demo_A() {
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * 2，静态初始化，创建数组时，显式的指定数组元素的初始值，数组的长度由系统根据元素的格式来决定；
     * tips：数组已经给定了元素，就不能再指定长度了
     */
    public static void Demo_B() {
        int[] arr2 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr2));
    }

    /**
     * 3,
     * tips：即指定长度又给定元素；
     */
    public static void Demo_C() {
        int[] arr3 = {3, 4, 5};
        System.out.println(Arrays.toString(arr3));
    }

    public  static int[] getArray() {
        int[] arr = {3, 4, 5, 6};

        return arr;
    }
}
