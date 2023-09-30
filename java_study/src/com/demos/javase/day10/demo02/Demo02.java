package com.demos.javase.day10.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator
 * List接口还提供了一个针对于List集合迭代的迭代器ListIterator
 * 该迭代器与我们之前学过的Iterator迭代器不同，ListIterator允许迭代器往上或者往下迭代，而Iterator迭代器只允许指针一直往下移动
 *
 * public boolean hasNext()：是否还存在下一个元素；
 * public boolean hasPrevious()：是否还存在上一个元素
 * E next()：获取下一个元素，如果指针目前是向上运行，第一次调用时会调转指向返回指针当前指向的元素；
 * E previous()：获取下一个元素，如果指针目前是向下运行，第一次调用时会调转指向返回指针当前指向的元素；
 * void add(E e)：添加一个元素到当前指针指向的后面一位
 * void remove()：移除当前指针指向的元素；
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList();
        cities.add("广州");
        cities.add("佛山");
        cities.add("东莞");
        cities.add("深圳");

        ListIterator iterator = cities.listIterator();

        while(iterator.hasNext()) {
            String ele = (String) iterator.next();
            if ("佛山".equals(ele)) {
                iterator.add("中山");
            }
            if ("东莞".equals(ele)) {
                iterator.remove();
            }
            System.out.println(cities);         // [广州, 佛山, 中山, 深圳]
        }
    }
}
