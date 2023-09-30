package com.demos.javase.day09.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator接口
 */
public class Demo06 {
    public static void main(String[] args) {
        // 使用多态方式创建对象
        Collection<String> cities = new ArrayList<String>();
        cities.add("上海");
        cities.add("北京");
        cities.add("合肥");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("s:" + s);
        }
    }
}
