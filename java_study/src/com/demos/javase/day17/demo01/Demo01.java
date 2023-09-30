package com.demos.javase.day17.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 类加载器
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 获取类加载器（类加载器类型为App classloader）
        ClassLoader classLoader = Demo01.class.getClassLoader();

        // 通过类加载获取路径下的资源
        InputStream is = classLoader.getResourceAsStream("com/demos/javase/day17/demo01/hello.txt");

        // 包装成缓冲字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String str = br.readLine();

        System.out.println(str);

        br.close();
    }
}
