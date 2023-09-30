package com.demos.javase.day09.demo05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection 集合
 * public boolean add(E e)： 把给定的对象添加到当前集合中 。
 * public void clear() :清空集合中所有的元素。
 * public boolean remove(E e): 把给定的对象在当前集合中删除。
 * public boolean contains(E e): 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty(): 判断当前集合是否为空。
 * public int size(): 返回集合中元素的个数。
 * public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo05 {
    public static void main(String[] args) {
        Collection cities = new ArrayList();
        cities.add("上海");
        cities.add("北京");
        cities.add("合肥");

        // 集合的长度
        System.out.println("cities.size() => " + cities.size());

        // 判断是否在集合中存在
        System.out.println("cities.contains('广州') => " + cities.contains("广州"));

        cities.remove("北京");
        cities.remove("not");
        System.out.println("cities.size() => " + cities.size());

        Object[] cityArr = cities.toArray();
        System.out.println(Arrays.toString(cityArr));

        cities.clear();
        Object[] cityArr2 = cities.toArray();
        System.out.println(Arrays.toString(cityArr2));

    }
}
