package com.demos.javase.day13.demo03;

import java.io.File;

/**
 * File类
 *
 * java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
 *
 * 构造方法
 * public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 * public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
 * public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
 */
public class Demo03 {
    public static void main(String[] args) {
        // 文件路径名
        String pathname = "/Users/ld_xu/Desktop/test_java_file.txt";
        File file = new File(pathname);

        // 通过父路径和子路径字符串
        String parentDir = "/Users/ld_xu/Desktop";
        String childName = "aaa.txt";
        File file1 = new File(parentDir, childName);

        // 通过父级File对象和子路径字符串
        File parentFile = new File("d:\\aaa");
        String child = "bbb.txt";
        File file2 = new File(parentFile, child);
    }
}
