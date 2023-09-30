package com.demos.javase.day07.demo09;

/**
 * Runtime类的使用
 */
public class Demo09 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("所有可用内存空间: " + totalMemory);
        System.out.println("最大可用内存空间: " + maxMemory);
        System.out.println("空余内存空间: " + freeMemory);
    }
}
