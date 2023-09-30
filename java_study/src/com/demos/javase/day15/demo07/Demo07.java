package com.demos.javase.day15.demo07;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 标准输出流
 * 标准输出流是一个打印流（PrintStream），他默认指向的是控制台，通过System.out获取标准输出流，因此我们之前总是使用System.out.println往控制台输出内容
 */
public class Demo07 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo07/";
        // 修改标准输出流
        System.setOut(new PrintStream(path + "StandardOutputStream.txt"));

        // 此时输出到StandardOutputStream.txt文件中，而不是控制台
        System.out.println("我是中国人");
        System.out.println("犯我中华者");
        System.out.println("虽远必诛");
    }
}
