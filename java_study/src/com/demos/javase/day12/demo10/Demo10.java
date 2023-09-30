package com.demos.javase.day12.demo10;

/**
 * 线程同步
 * 当我们使用多个线程访问同一资源的时候，且多个线程中对资源有写的操作，就容易出现线程安全问题。
 * 要解决上述多线程并发访问一个资源的安全性问题：也就是解决重复票与不存在票问题，Java中提供了同步机制(synchronized)来解决。
 *
 * Java中提供了三种方式完成同步操作：
 *
 * 同步代码块。
 * 同步方法。
 * 锁机制。
 */
public class Demo10 {
    public static void main(String[] args) throws InterruptedException {
        Ticket2 ticket = new Ticket2();

        Thread t1 = new Thread(ticket, "广州");
        Thread t2 = new Thread(ticket, "上海");
        Thread t3 = new Thread(ticket, "北京");

        t1.start();
        t2.start();
        t3.start();
    }

}
