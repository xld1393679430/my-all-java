package com.demos.javase.day13.demo04;

import java.io.File;

/**
 * File类
 *
 * 获取文件信息方法
 * public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 * public String getPath() ：将此File转换为路径名字符串。
 * public String getName() ：返回由此File表示的文件或目录的名称。
 * public long length() ：返回由此File表示的文件的长度，如果是文件夹则返回0。
 *
 *
 * 文件的创建与删除方法
 * public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 * public boolean delete() ：删除由此File表示的文件或目录。
 * public boolean mkdir() ：创建由此File表示的目录。
 * public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 *
 * 目录的遍历
 * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
 * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 */
public class Demo04 {
    public static void main(String[] args) {
        // 文件路径名
        String pathname = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day13/demo04/Demo04.java";
        File file = new File(pathname);
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件构造路径：" + file.getPath());
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件长度：" + file.length());

        System.out.println("------------");
        File f2 = new File("/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day13/demo04");
        System.out.println("目录绝对路径：" + f2.getAbsolutePath());
        System.out.println("目录构造路径：" + f2.getPath());
        System.out.println("目录名称：" +f2.getName() );
        System.out.println("目录长度：" + f2.length());

    }
}
