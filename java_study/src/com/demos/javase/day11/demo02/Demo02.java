package com.demos.javase.day11.demo02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Map
 *
 * Map是所有双列集合的顶层父类，因此Map中具备的是所有双列集合的共性方法；常用的方法如下：
 *
 * public V put(K key, V value): 把指定的键与指定的值添加到Map集合中。
 * public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * boolean containsKey(Object key) 判断集合中是否包含指定的键。
 * public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 * public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 * public Collection<V> values()：获取该map集合的所有value
 *
 * 数据的遍历
 * 方法：
 *
 * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 * 步骤：
 *
 * 1）根据keySet()方法获取所有key的集合
 * 2）通过foreach方法遍历key集合，拿到每一个key
 * 3）通过get()方法，传递key获取key对应的value；
 */
public class Demo02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // 添加元素到集合
        map.put("name", "小马哥");
        map.put("age", 20);
        map.put("爱好", "学习");
        System.out.println("map => " + map);

        Collection values = map.values();
        System.out.println("values => " + values);

        // String remove(String key): 根据key来删除记录,并将key对应的value返回
        Object age = map.remove("age");
        System.out.println("age => " + age);
        System.out.println("map => " + map);

        System.out.println("map.get('name') =>" + map.get("name"));

        // 1.获取key的集合
        Set keys = map.keySet();
        System.out.println("keys => " + keys);
    }
}
