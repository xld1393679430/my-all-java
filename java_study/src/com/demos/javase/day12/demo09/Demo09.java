package com.demos.javase.day12.demo09;

/**
 * 线程安全问题
 *
 * 案例，从广州开往南昌的票数共有100张票，售票窗口分别有“广州南站”、“广州北站”、“广州站”等
 * 发现程序出现了两个问题：有的票卖了多次,卖票顺序不一致
 *
 * demo10 通过线程同步解决该问题
 *
 */
public class Demo09 {
    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "广州");
        Thread t2 = new Thread(ticket, "上海");
        Thread t3 = new Thread(ticket, "北京");

        t1.start();
        t2.start();
        t3.start();
    }

}
