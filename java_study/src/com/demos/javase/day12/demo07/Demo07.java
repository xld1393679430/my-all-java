package com.demos.javase.day12.demo07;

/**
 * 线程优先级
 * 默认情况下，所有的线程优先级默认为5，最高为10，最低为1。优先级高的线程更容易让线程在抢到线程执行权；
 * 通过如下方法可以设置指定线程的优先级：
 * public final void setPriority(int newPriority)：设置线程的优先级。
 */
public class Demo07 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("线程1: " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程2: " + i);
                }
            }
        });

        // t2的优先级高不代表先执行完
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
