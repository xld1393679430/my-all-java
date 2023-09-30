package com.demos.javase.day13.demo06;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器优化
 * java.io.FileFilter是一个接口，是File的过滤器。 该接口的对象可以传递给File类的listFiles(FileFilter) 作为参数， 接口中只有一个方法。
 *
 * boolean accept(File pathname) ：将此目录的每个文件传递给accept方法，此方法返回true则保留此文件，反之剔除；
 * 分析：
 *
 * 接口作为参数，需要传递子类对象，重写其中方法。我们选择匿名内部类方式，比较简单。
 * accept方法，参数为File，表示当前File下所有的子文件和子目录。保留住则返回true，过滤掉则返回false。保留规则：
 * 要么是.java文件。
 * 要么是目录，用于继续遍历。
 * 通过过滤器的作用，listFiles(FileFilter)返回的数组元素中，子文件对象都是符合条件的，可以直接打印。
 */
public class Demo06 {
    public static void main(String[] args) {
        File file = new File("/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day13");
        getAllJavaFile(file);
    }

    private static void getAllJavaFile(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });

        for(File f: files) {
            if (f.isFile()) {
                System.out.println("文件名：" + f.getName());
            } else {
                getAllJavaFile(f);
            }
        }
    }
}
