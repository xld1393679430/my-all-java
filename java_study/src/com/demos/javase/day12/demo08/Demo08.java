package com.demos.javase.day12.demo08;

/**
 * 线程礼让
 * 在多线程执行时，线程礼让，告知当前线程可以将执行权礼让给其他线程，礼让给优先级相对高一点的线程，
 * 但仅仅是一种告知，并不是强制将执行权转让给其他线程，当前线程将CPU执行权礼让出去后，也有可能下次的执行权还在原线程这里；
 * 如果想让原线程强制让出执行权，可以使用join()方法
 *
 * public static void yield()：将当前线程的CPU执行权礼让出来；
 */
public class Demo08 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("线程1：" + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i = 0; i < 100; i++) {
                   if( i == 10) {
                       // 当i等于10的时候该线程礼让
                       Thread.yield();
                   }
                   System.out.println("线程2：" + i);
               }
            }
        });

        t1.start();
        t2.start();
    }
}
