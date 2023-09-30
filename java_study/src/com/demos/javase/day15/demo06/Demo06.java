package com.demos.javase.day15.demo06;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流
 * 打印流的功能主要是将数据打印（输出）到控制台，方便我们输出的；
 */
public class Demo06 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo06/";
        PrintStream ps = new PrintStream(path + "ps.txt");

        ps.println("我是");
        ps.println("中国");
        ps.println("人");

        ps.close();
    }
}
