package com.demos.javase.day10.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口
 * List接口存储的数据是有序排列的，原来存储的时候是什么顺序，取出来就什么顺序（Set接口存储的是无序的）；
 * List接口为存储的每一个元素都分配了一个索引，通过索引我们可以精确的来访问某一个指定的元素；
 * List接口存储的数据允许存在重复，这与Set接口不同（Set接口不允许存储相同的元素）；
 *
 * 常用方法
 * public boolean add(int index, E element)：将指定的元素，添加到该集合中的指定位置上。
 * public E get(int index)：返回集合中指定位置的元素。
 * public boolean remove(int index)： 移除列表中指定位置的元素, 返回的是被移除的元素。
 * public E set(int index, E element)：用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
 * List<E> subList(int fromIndex, int toIndex)：从fromIndex下标截取到toIndex下标。
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();
        cities.add("南京");
        cities.add("南昌");
        cities.add("南宁");

        System.out.println("cities => " + cities);
        List newList = cities.subList(0, 2);
        System.out.println("newList => " + newList);
        System.out.println("cities => " + cities);

        cities.add(1, "上海");
        System.out.println("cities => " + cities);

        cities.set(0, "合肥");
        System.out.println("cities => " + cities);

        String removedCity =  cities.remove(0);
        System.out.println("removedCity => " + removedCity);
        System.out.println("cities => " + cities);
    }
}
