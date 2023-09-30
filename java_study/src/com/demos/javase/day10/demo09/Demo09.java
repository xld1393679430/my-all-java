package com.demos.javase.day10.demo09;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public class Demo09 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add(new Person("小明", 20));
        set.add(new Person("小红", 10));
        set.add(new Person("小胖", 15));

        System.out.println(new Person("小明", 20).toString());

        System.out.println("set => " + set);
        System.out.println("set.size() => " + set.size());
    }
}
