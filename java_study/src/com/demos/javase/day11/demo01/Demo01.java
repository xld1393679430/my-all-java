package com.demos.javase.day11.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add(new Province("台湾", "台", "华东"));
        list.add(new Province("澳门", "澳","华南"));

        list.add(new Book("《史记》","司马迁"));
        list.add(new Book("《三国志》","陈寿"));

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object n = it.next();
            System.out.println(n.toString());
        }
    }
}
