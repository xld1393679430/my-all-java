package com.demos.javase.day01.demo1;

/**
 * 计算机基础&Java概述
 *
 * 数据类型	    关键字	    内存占用	    取值范围
 * 字节型	    byte	    1个字节	    -128~127
 * 短整型	    short	    2个字节	    -32768~32767
 * 整型	        int（默认）	4个字节	    -2147483648~2147483647
 * 长整型	    long	    8个字节	    -2的63次方~2的63次方-1
 * 单精度浮点数	float	    4个字节	    1.4013E-45~3.4028E+38
 * 双精度浮点数	double（默认）8个字节	    4.9E-324~1.7977E+308
 * 字符型	    char	    2个字节	    0-65535
 * 布尔类型	    boolean	    1个字节	    true，false
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 我是注释

        /**
         * 多行注释
         */
        System.out.println("hello word 你好");

        char c = 'a';
        System.out.println("char c = " + c);
    }
}