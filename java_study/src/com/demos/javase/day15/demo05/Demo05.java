package com.demos.javase.day15.demo05;

import java.io.*;
import java.util.ArrayList;

/**
 * 案例分析
 * 把若干学生对象 ，保存到集合中。
 * 把集合序列化。
 * 反序列化读取时，只需要读取一次，转换为集合类型。
 * 遍历集合，可以打印所有的学生信息
 */
public class Demo05 {
    public static final String path = "/Users/ld_xu/Documents/work/my-code/java_project_2/java_study/src/com/demos/javase/day15/demo05/";

    public static void main(String[] args) throws Exception {
        Book book1 = new Book("《西游记》", "吴承恩");
        Book book2 = new Book("《三国演义》", "罗贯中");
        Book book3 = new Book("《水浒传》", "施耐庵");
        Book book4 = new Book("《红楼梦》", "曹雪芹");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        // serialize(bookList);
        deserialize();

    }

    public static void serialize(ArrayList<Book> bookList) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + "list.txt"));
        oos.writeObject(bookList); // 会出现乱码
        oos.close();
    }

    public static void deserialize() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path + "list.txt"));
        ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
        System.out.println(list);
    }
}
