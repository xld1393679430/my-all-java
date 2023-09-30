package com.demos.javase.day07.demo12;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 常用方法
 * equals: 将字符串与指定的字符串进行比较
 * equalsIgnoreCase: 将字符串与指定的字符串进行比较，忽略大小写。
 * length: 返回此字符串的长度
 * concat: 将指定的字符串连接到该字符串的末尾。
 * charAt: 返回指定索引处的字符。
 * indexOf: 返回指定子字符串第一次出现在该字符串内的索引
 * toCharArray: 返回字符串的字符表示形式
 * getBytes: 返回字符串的字节表示形式
 * toLowerCase: 将字符串转换为小写
 * toUpperCase: 将字符串转换为大写
 * replace: 将与target匹配的字符串使用replacement字符串替换
 * substring (int beginIndex): 回一个子字符串，从beginIndex开始截取字符串到字符串结尾
 * substring (int beginIndex, int endIndex): 返回一个子字符串，从beginIndex到
 * split(String regex): 将此字符串按照给定的regex（规则）拆分为字符串数组。
 */
public class Demo12 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println("s1:" + s1 + "; s2:" + s2 + "; s3:" + s3);
        System.out.println("s1 == s2 => " + (s1 == s2));
        System.out.println("s1.equals(s2) => " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s3) => " + s1.equalsIgnoreCase(s3));

        System.out.println("s1.concat('-world') => " + (s1.concat("-world")));
        System.out.println("s1.charAt(1) => " + s1.charAt(1));
        // System.out.println("s1.charAt(-1) => " + s1.charAt(-1)); // 报错 StringIndexOutOfBoundsException
        // System.out.println("s1.charAt(s1.length()) => " + s1.charAt(s1.length())); // StringIndexOutOfBoundsException
        System.out.println("s1.charAt(s1.length() - 1) => " + s1.charAt(s1.length() - 1));

        System.out.println("s1.indexOf('h') => " + s1.indexOf('h'));
        System.out.println("s1.indexOf(1) => " + s1.indexOf(1));

        System.out.println("s1.substring(2) => " + s1.substring(2));
        System.out.println("s1 => " + s1);

        System.out.println("s1.substring(2, 4) => " + s1.substring(2, 4));

        System.out.println("s1.split('l') => " + Arrays.toString(s1.split("l")));

        String testStr = new String("abc");
        System.out.println("testStr = " + testStr);
        System.out.println("testStr == 'abc' => " + (testStr == "abc"));
    }
}
