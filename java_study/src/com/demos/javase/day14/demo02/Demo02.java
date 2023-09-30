package com.demos.javase.day14.demo02;

import java.io.*;

/**
 * 字符流 FileReader
 *
 * java.io.FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
 * Tips：Windows系统的中文编码默认是GBK编码表。idea中默认是UTF-8
 *
 * 1）构造方法
 * FileReader(File file)： 创建一个新的 FileReader ，给定要读取的File对象。
 * FileReader(String fileName)： 创建一个新的 FileReader ，给定要读取的文件的名称。
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day14/demo02/";

        File file1 = new File(path + "a.txt");
        FileWriter fw1 = new FileWriter(file1);
        fw1.write("abcde");

        /*
        【注意】关闭资源时,与FileOutputStream不同。
      	 如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        */
        fw1.close();

        FileReader fr1 = new FileReader(file1);
        int len;
        char[] buf = new char[2];
        while((len = fr1.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }


        System.out.println("-------------");

        File file2 = new File(path + "b.txt");
        FileWriter fw2 = new FileWriter(file2);
        fw2.write("我是中国人");
        fw2.close();
    }
}
