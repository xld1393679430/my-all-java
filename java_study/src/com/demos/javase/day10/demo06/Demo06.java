package com.demos.javase.day10.demo06;

import java.util.Stack;

/**
 * Stack集合
 * Stack继承了Vector，因此Vecotr中的方法Stack也同样具备，包括Collection，List等接口中的方法；
 * 并且Stack并没有对Vector的方法进行重写改造（原封不动的继承下来），而是在Vector的基础上添加了许多栈有关的操作，
 * 例如压栈（push），弹栈（pop）等；我们也可以完全把Stack当作一个Vector集合用；
 *
 * public E push(E item)：添加一个元素到栈顶（压栈）；
 * public synchronized E pop()：从栈顶移除一个元素并返回（弹栈）；
 * public synchronized E peek()：获取栈顶的一个元素返回，该元素不会从栈顶移除；
 */
public class Demo06 {
    public static void main(String[] args) {
        Stack<String> mountains = new Stack();
        mountains.add("泰山");
        mountains.add("华山");
        mountains.add("衡山");
        mountains.add("恒山");
        System.out.println("mountains => " + mountains);

        // 根据索引获取元素
        System.out.println("mountains.get(0) => " + mountains.get(0));

        mountains.push("哈哈");
        System.out.println("mountains push => " + mountains);

        mountains.pop();
        System.out.println("mountains pop => " + mountains);

        String m = mountains.peek();
        System.out.println("mountains peek => " + m);
    }
}
