package com.demos.javase.day14.demo01;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * FileOutputStream类
 *
 * 构造方法
 * FileOutputStream的构造方法如下：
 * 1,public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
 * 2,public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。
 *
 * Tips：当创建一个流对象时，需要指定一个文件路径，如果该文件以及存在则会清空文件中的数据，如果不存在则创建一个新的文件；
 *
 * 在UTF-8编码下，一个中文占用3个字节，GBK编码下一个中文占用2个字节
 */
public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day14/demo01/";

        // 使用File对象创建流对象
        File file = new File(path + "a.txt");
        FileOutputStream fos1 = new FileOutputStream(file);

        fos1.write(97);
        fos1.write(98);
        fos1.write(99);
        // 关闭资源
        fos1.close();

        System.out.println("----------");

        // 使用文件名称创建流对象
        FileOutputStream fos2 = new FileOutputStream(path + "b.txt");

        byte[] b1 = "我是中国人".getBytes(StandardCharsets.UTF_8);
        fos2.write(b1);
        fos2.close();

        System.out.println("----------");
        FileOutputStream fos3 = new FileOutputStream(path + "c.txt");
        // 字符串转换成字节数组
        byte[] b2 = "abcdefg".getBytes(StandardCharsets.UTF_8);
        // 写出从索引2开始，2个字节
        fos3.write(b2,2, 3);
        fos3.close();

        System.out.println("----------");
        FileInputStream fis = new FileInputStream(file);
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println(fis.read()); // 读取到文件的末尾返回-1
        fis.close();

        System.out.println("----------读取一个字节数组");
        FileInputStream fis2 = new FileInputStream(file);
        byte[] data = new byte[2];
        int len;
        while((len = fis2.read(data)) != -1) {
            System.out.println(new String(data, 0 , len));
        }
        fis2.close();
    }
}
