package com.demos.javase.day15.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲流
 * 构造方法
 * public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
 * public BufferedWriter(Writer out)： 创建一个新的缓冲输出流。
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo03/";

        BufferedWriter bw = new BufferedWriter(new FileWriter(path + "test.txt"));

        bw.write("我是");
        bw.newLine();

        bw.write("中国");
        bw.newLine();

        bw.close();
    }
}
