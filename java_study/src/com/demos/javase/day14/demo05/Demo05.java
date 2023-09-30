package com.demos.javase.day14.demo05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 属性集
 *
 * 构造方法
 * public Properties() ：创建一个空的属性列表。
 *
 * 基本的存储方法
 * public Object setProperty(String key, String value) ： 保存一对属性。
 * public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
 * public Set<String> stringPropertyNames() ：所有键的名称的集合。
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "1024");

        System.out.println("properties:" + properties);

        System.out.println("------------");
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day14/demo05/";
        Properties prop = new Properties();
        // 加载文本中信息到属性集
        prop.load(new FileInputStream(path + "prop.txt"));
        // 遍历集合并打印
        Set<String> names = prop.stringPropertyNames();
        for(String name: names) {
            System.out.println(name + "----" + prop.getProperty(name));
        }
    }
}
