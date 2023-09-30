package com.demos.javase.day12.demo06;

/**
 * 守护线程
 * 当用户线程（非守护线程）行完毕时，守护线程也会停止执行但由于CPU运行速度太快，
 * 当用户线程执行完毕时，将信息传递给守护线程，会有点时间差，而这些时间差会导致还会执行一点守护线程；
 *
 * 需要注意的是：不管开启多少个线程（用户线程），守护线程总是随着第一个用户线程的停止而停止
 *
 * public final void setDaemon(boolean on)：设置线程是否为守护线程
 */
public class Demo06 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("守护线程1: " + i);
                }
            }
        });

        //将t1设置为守护线程
        t1.setDaemon(true);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("守护线程2: " + i);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("守护线程3: " + i);
                }
            }
        });

        //开启三条线程,不管是t2还是t3线程执行完毕,守护线程都会停止
        t1.start();
        t2.start();
        t3.start();

    }
}
