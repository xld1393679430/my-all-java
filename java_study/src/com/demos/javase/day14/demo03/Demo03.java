package com.demos.javase.day14.demo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流可以拷贝文本文件，但不可以拷贝非文本文件
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day14/demo03/";
        FileReader fr = new FileReader(path + "a.txt");
        FileWriter fw = new FileWriter(path + "a_copy.txt");

        // 准备一个字符数组接收字符数据
        char[] data = new char[10];

        int len;

        while((len = fr.read(data)) != -1) {
            fw.write(data, 0, len);
        }

        fr.close();
        fw.close();
    }
}
