package com.demos.javase.day15.demo02;

import java.io.*;

/**
 * 使用缓冲流拷贝
 *
 * 可以看出，缓冲流拷贝文件的效率比普通流高太多太多，因此我们在做大文件拷贝时应该尽量选用缓冲流；
 */
public class Demo02 {
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo02/";
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path + "1.png"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + "1_copy.png"));
                ) {
            int b;
            while (( b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");
    }
}
