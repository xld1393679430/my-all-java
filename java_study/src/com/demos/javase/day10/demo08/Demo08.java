package com.demos.javase.day10.demo08;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 集合
 * 与HashSet一样，TreeSet存储的元素也是无序；存储的元素虽然是无序的，但TreeSet可以根据排序规则对存储的元素进行排序，可以对集合中的元素提供排序功能；需要注意的是TreeSet存储的元素必须实现了Comparable接口，否则将抛出ClassCastException
 * TreeSet的特点：
 * 1,TreeSet每存储一个元素都会将该元素提升为Comparable类型，如果元素未实现Comparable接口，则抛出ClassCastException异常；
 * 2,存储的数据是无序的，即存取顺序不一致，但TreeSet提供排序功能；
 * 3,存储的元素不再是唯一，具体结果根据compareTo方法来决定；
 *
 * TreeSet底层依赖红黑树，TreeSet得到CompareTo方法三类不同的值的含义如下：
 *
 * 1）正数：返回正数代表存储在树的右边
 * 2）负数：存储在树的左边
 * 3）0：不存储这个元素
 */
public class Demo08 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        // String类是重写了Compable接口的，因此可以被存储到TreeSet集合中：
        set.add("1");
        set.add("2");

        System.out.println("set => " + set);
    }
}
