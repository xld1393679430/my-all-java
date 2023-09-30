package com.demos.javase.day11.demo03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Entry对象
 *
 * Map集合中几条记录存储的是两个对象，一个是key，一个是value，这两个对象加起来是map集合中的一条记录，也叫一个记录项；
 * 这个记录项在Java中被Entry对象所描述；一个Entry对象中包含有两个值，一个是key，另一个则是key对应的value，
 * 因此一个Map对象我们可以看做是多个Entry对象的集合，即一个Set<Entry>对象
 */
public class Demo03 {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap();

        //添加元素到集合
        cities.put("山东", "济南");
        cities.put("山西", "太原");
        cities.put("河南", "郑州");
        cities.put("河北", "石家庄");

        // 1,获取改Map的Entry集合
        Set<Map.Entry<String, String>> entryList = cities.entrySet();

        // 2.遍历该Entry集合,获取每一个entry,也就是Map中的每一条记录
        for(Map.Entry<String, String> entry: entryList) {
            // 获取当前entry对象的key(省份)
            String province = entry.getKey();

            // 获取当前entry对象的value(城市)
            String city = entry.getValue();

            System.out.println(province + "省的省会是：" + city);
        }
    }
}
