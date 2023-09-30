package com.demos.javase.day10.demo10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue集合
 * Queue也是属于单列集合，因此Queue同样具备Collection中的相关方法
 *
 * Queue中的方法如下：
 *
 * boolean add(E e)：将元素添加到队列的尾部
 * boolean offer(E e)：将元素添加到队列的尾部，功能和add()方法一致
 * E remove()：移除队列头部的元素并将该元素返回
 * E poll()：移除队列头部的元素并将该元素返回，功能和remove()方法一致
 * E element()：获取队列头部的元素，并不会删除该元素
 * E peek()：获取队列头部的元素，并不会删除该元素，功能和element()方法一致
 */
public class Demo10 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        // 添加元素到队列的尾部
        queue.add("滕王阁");
        queue.add("黄鹤楼");
        queue.add("岳阳楼");

        System.out.println("queue => " + queue);

        // 移除队列的头部元素并返回
        String first = queue.remove();
        System.out.println("first => " + first);
        System.out.println("queue => " + queue);

        // 获取队列的头部元素(并不会移除)
        String element = queue.element();
        System.out.println("first => " + element);
        System.out.println("queue => " + queue);

        System.out.println("--------------");

        Queue<String> queue1 = new LinkedList<>();

        // 添加元素到队列的尾部
        queue1.offer("滕王阁");
        queue1.offer("黄鹤楼");
        queue1.offer("岳阳楼");

        System.out.println("queue1 => " + queue1);

        // 移除队列头部元素并返回 功能和remove()方法一致
        String first2 = queue1.poll();
        System.out.println("first2 => " + first2);
        System.out.println("queue1 => " + queue1);

        // 获取队列头部的元素(不会移除) 功能和element()方法一致
        String element2 = queue.peek();
        System.out.println("element2 => " + element2);
        System.out.println("queue1 => " + queue1);

    }
}
