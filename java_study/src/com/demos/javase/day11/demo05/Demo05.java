package com.demos.javase.day11.demo05;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
 * 1, 必须实现Compareable接口；
 * 2,存储的数据是无序的，但提供排序功能（Comparable接口）；
 * 3,存储的元素不再是唯一，具体结果根据compareTo方法来决定；
 * <p>
 * 需求： 定义一个Book类，并重写Compareable方法，按住价格升序排序：
 */
public class Demo05 {
    public static void main(String[] args) {
        Map<String, Book> map = new TreeMap<>();

        map.put("a", new Book("《计算机网络原理》", 10.0));
        map.put("b", new Book("《高性能MySQL》", 30.0));
        map.put("c", new Book("《深入理解Java虚拟机》", 20.0));

        System.out.println("map => " + map);

    }
}
