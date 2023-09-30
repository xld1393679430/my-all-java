package com.demos.javase.day09.demo07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * foreach
 */
public class Demo07 {
    public static void main(String[] args) {
        // 遍历数组
        String[] cities = {"上海", "北京", "广州"};
        for(String city: cities) {
            System.out.println("city => " + city);
        }

        System.out.println("---------------------");

        // 遍历集合
        Collection<String> collection = new ArrayList<String>();
        collection.add("宁夏银川");
        collection.add("新建乌鲁木齐");
        collection.add("西藏拉萨");
        collection.add("青海西宁");

        // 使用增强for遍历
        for(String city: collection) {
            System.out.println("city => " + city);
        }
    }
}
