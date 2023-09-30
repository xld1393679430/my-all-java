package com.demos.javase.day12.demo05;

/**
 * 线程的加入
 * public final void join()：让线程在当前线程优先执行,直至t线程执行完毕时,再执行当前线程.
 * public final void join(long millis)：让线程执行millis毫秒，然后将线程执行器抛出，给其他线程争抢
 */
public class Demo05 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println("线程1:" + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("线程2:" + i);
                    if (i == 100) {
                        try {
                            //当i等于500的时候,让t1线程加入执行,直至执行完毕
                            t1.join();
                            //当i等于500的时候,让t1线程加入执行,执行10毫秒之后交出执行权
                            // t1.join(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
