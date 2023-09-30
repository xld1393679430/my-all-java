package com.demos.javase.day15.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲流
 * 构造方法
 * public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
 * public BufferedOutputStream(OutputStream out)： 创建一个新的缓冲输出流。
 *
 * 分别使用普通流和缓冲流对一个大小为10.4MB的文件进行拷贝，查看两种方案所花费的时间；
 */
public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo01/";
        try (
                FileInputStream fis = new FileInputStream(path + "1.png");
                FileOutputStream fos = new FileOutputStream(path + "1_copy.png");
                ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + " 毫秒");
    }
}
