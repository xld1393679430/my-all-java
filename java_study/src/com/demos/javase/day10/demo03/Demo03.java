package com.demos.javase.day10.demo03;

import java.util.LinkedList;

/**
 * LinkedList
 * LinkedList提供索引操作的相关方法，但LinkedList底层并不是采用数组实现，而是采用链表来实现，链表本身并没有索引而言，
 * 换句话来说，LinkedList并不能通过索引去查询一次就返回所需要的元素，而是采用一种算法（二分查找法），
 * 根据索引去挨个遍历查询整个链表查询所需要的元素，这样下来，LinkedList的查询效率将远不如ArrayList
 */
public class Demo03 {
    public static void main(String[] args) {
        LinkedList cities = new LinkedList();
        cities.add("广州");
        cities.add("杭州");
        cities.add("福州");
        cities.add("兰州");
        cities.add("郑州");

        System.out.println("cities => " + cities);

        cities.add(2, "合肥");
        System.out.println("cities => " + cities);

        System.out.println("cities.get(2) => " + cities.get(2));

        cities.set(2, "安庆");
        System.out.println("cities => " + cities);

        cities.remove(2);
        System.out.println("cities => " + cities);
    }
}
