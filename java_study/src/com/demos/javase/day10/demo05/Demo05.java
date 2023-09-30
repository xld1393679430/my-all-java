package com.demos.javase.day10.demo05;

import java.util.ListIterator;
import java.util.Vector;

/**
 * Vector集合
 * ector集合与的主要ArrayList的区别如下：
 *
 * 1）Vector集合在扩容是默认是扩容至原来的2倍，ArrayList则是1.5倍，关于容量都是初始化为10
 * 2）Vector集合是线程安全集合，他所有的方法之间是线程同步的，这意味则每次调用Vector的方法时都需要先获取锁，
 * 方法结束后也要释放锁，造成不必要的性能开销；ArrayList是线程不安全集合，调用ArrayList集合中的方法不需要先获取锁，
 * 调用完毕后也不需要释放锁；因此ArrayList性能比Vector要高，但相对比与Vector集合，ArrayList的安全性较低（可能产生并发问题）；
 * 3）Vecotr集合支持Enumeration，也支持ListIterator迭代器，ArrayList支持ListIterator但不支持Enumeration。
 * 在使用Enumeration迭代元素时允许集合对元素进行增删
 */
public class Demo05 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("中国");
        vector.add("美国");
        vector.add("英国");

        System.out.println("vector => " + vector);

        // addElement是Vector集合特有的功能,和add方法功能一致
        vector.addElement("法国");
        System.out.println("vector => " + vector);

        for(String v: vector) {
            System.out.println("v => " + v);
        }

        System.out.println("-------------");

        ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.println("it => " + it);
        }

    }
}
