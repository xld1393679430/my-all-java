package com.demos.javase.day15.demo04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象的序列化
 * 一个对象要想序列化，必须满足两个条件:
 *
 * 该类必须实现java.io.Serializable 接口，Serializable 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，会抛出NotSerializableException 。
 * 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用transient 关键字修饰。
 */
public class Demo04 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo04/";

        Goods goods = new Goods("苹果", 20.20, 10000);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + "goods.txt"));

            System.out.println(goods.toString());

            oos.writeObject(goods + "\r\n"); // 会出现文字乱码

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
