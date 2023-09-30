package com.demos.javase.day12.demo10;

public class Ticket2 implements Runnable {

    private Integer ticket = 100;

    // 锁对象
    private Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            // 加上同步代码块，把需要同步的代码放入代码块中，同步代码块中的锁对象必须保持一致
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第：" + (101 - ticket) + "张票");
                ticket--;
            }

        }
    }
}
