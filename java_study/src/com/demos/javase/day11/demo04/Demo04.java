package com.demos.javase.day11.demo04;

import java.util.HashMap;
import java.util.Map;

/**
 * HashSet的去重原理实质上指的就是HashMap的Key的去重原理；
 */
public class Demo04 {
    public static void main(String[] args) {
        Map<City, String> map = new HashMap<>();

        map.put(new City("合肥", "华中"), "A");
        map.put(new City("合肥", "华中"), "A");

        // 如果City没有重写equals方法底层比较的是地址值,两个City对象肯定不一致,因此存储了2个
        // 如果City重新了hashCode和equals方法， 两个City对象一致,只会存储了1个
        System.out.println("map.size() => " + map.size());
    }
}
