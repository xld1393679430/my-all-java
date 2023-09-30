package com.demos.javase.day12.demo13;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock锁
 * java.util.concurrent.locks.Lock机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作，同步代码块/同步方法具有的功能Lock都有，除此之外更强大，更体现面向对象。
 *
 * Lock锁也称同步锁，加锁与释放锁方法化了，如下：
 *
 * public void lock() ：加同步锁。
 * public void unlock()：释放同步锁。
 */
public class Demo13 {
    public static int count = 10;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread() {
            @Override
            public void run() {
                while(count > 0) {
                    //开启锁
                    lock.lock();
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    count--;
                    // 释放锁
                    lock.unlock();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while(count > 0) {
                    //开启锁
                    lock.lock();
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                    count--;
                    // 释放锁
                    lock.unlock();
                }
            }
        }.start();
    }
}
