package com.demos.javase.day10.demo07;

import java.util.HashSet;

/**
 * HashSet 集合
 * HashSet是Set接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的（即存取顺序不一致）
 * HashSet底层数据结构在JDK8做了一次重大升级，JDK8之前采用的是Has表，也就是数组+链表来实现；到了JDK8之后采用数组+链表+红黑树来实现；
 *
 * HashSet特点总结
 * 1）存取无序，元素唯一，先比较hashCode，当hash冲突时再比较equals，equals返回true则不存；
 * 2）底层采用Hash表数据结构，当数组长度大于等于64并且链表长度大于等于8时，链表将会转换为红黑树，当长度降到6时将会重新转换为链表；
 * 3）HashSet默认数组长度为16，默认的负载因子为0.75；
 * 4）每次数组扩容时，默认扩容到原来的2倍；
 */
public class Demo07 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("湖北");
        set.add("河北");
        set.add("河北");          // HashSet带有去重特点,"河北"已经存储过了,不会再存储

        System.out.println("set => " + set);

        System.out.println("--------------------");

        HashSet set2 = new HashSet();
        set2.add(new A());

        set2.add(new A());

        System.out.println("set2.size() => " + set2.size()); // 2

        System.out.println("--------------------");

        HashSet set3 = new HashSet();
        A a = new A();
        set3.add(a);

        set3.add(a);

        System.out.println("set3.size() => " + set3.size()); // 1

        System.out.println("--------------------");

        HashSet set4 = new HashSet();
        set4.add(new String("Hello"));
        set4.add("Hello");
        System.out.println("set4.size() => " + set4.size()); // 1
    }
}

class A{}
