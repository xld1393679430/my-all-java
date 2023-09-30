package com.demos.javase.day07.demo11;

/**
 * String类
 * 创建后不可变，其值在创建之后将被视为常量
 */
public class Demo11 {
    public static void main(String[] args) {
        // String() 创建一个空的字符串对象
        String str1 = new String();
        System.out.println("str1:" + str1);

        // String(char[] value) 通过字符数组来创建字符串对象
        char[] chs = {'A', 'B', 'C'};
        String str2 = new String(chs);
        System.out.println("str2:" + str2);

        // String(byte[] bytes) 通过字节数组来构造新的字符串对象
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("str3:" + str3);

        // String(byte[] bytes, int a, int b) 通过字节数组一部分来构造新的字符串对象
        String str4 = new String(bytes, 1, 2);
        System.out.println("str4:" + str4);
    }
}
