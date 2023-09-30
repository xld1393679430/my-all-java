package com.demos.javase.day10.demo04;

import java.util.LinkedList;

/**
 * Queue接口
 * LinkedList的强项并不在于元素的查询，而是元素的增删，
 * 而我们在增删过程中，最好操作链表的头部或者尾部，因为这样不需要去浪费额外的时间来查询需要操作的元素位置，
 * 在Queue接口中定义有很多关于链表（队列）头和尾部的操作；
 *
 * public void addFirst(E e)：将指定元素插入此列表的开头。
 * public void addLast(E e)：将指定元素添加到此列表的结尾。
 * public E getFirst()：返回此列表的第一个元素。
 * public E getLast()：返回此列表的最后一个元素。
 * public E removeFirst()：移除并返回此列表的第一个元素。
 * public E removeLast()：移除并返回此列表的最后一个元素。
 * public boolean isEmpty()：如果列表不包含元素，则返回true。
 */

public class Demo04 {
    public static void main(String[] args) {
        LinkedList cities = new LinkedList<String>();

        // 添加元素到头部
        cities.addFirst("广西");      // cities: [广西]
        cities.addFirst("陕西");      // cities: [陕西, 广西]
        cities.addFirst("山西");      // cities: [山西, 陕西, 广西]
        cities.addFirst("江西");      // cities: [江西, 山西, 陕西, 广西]

        System.out.println("cities.getFirst() => " + cities.getFirst());

        System.out.println("cities.getLast() => " + cities.getLast());

        cities.removeFirst();
        System.out.println("cities=> " + cities);
    }
}
