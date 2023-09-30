package com.demos.javase.day14.demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流既可以拷贝文本文件，又可以拷贝非文本文件
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day14/demo04/";
        FileInputStream fis = new FileInputStream(path + "shanghai.jpeg");
        FileOutputStream fos = new FileOutputStream(path + "shanghai_copy.jpeg");

        int len;
        byte[] data = new byte[1024];

        while((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        fis.close();
        fos.close();
    }
}
