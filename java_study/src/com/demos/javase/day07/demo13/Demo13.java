package com.demos.javase.day07.demo13;

/**
 * 字符串的比较
 * !!! 在字符串拼接时，只要是和变量相加，其都会产生一个新的字符串； !!!
 */
public class Demo13 {
    public static void main(String[] args) {
        int i = 1;
        String s1 = "hello" + i;
        String s2 = "hello" + i;

        System.out.println("s1 == s2 => " + (s1 == s2));
    }
}
