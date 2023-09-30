package com.demos.javase.day13.demo01;

/**
 * 等待与随机唤醒
 *
 * public final void wait()：让当前线程进入等待状态，并且释放锁对象。
 * 注意：wait方法是锁对象来调用，调用wait()之后将释放当前锁，并且让当前锁对象对应的线程处于等待（Waiting）状态；
 *
 * public final native void notify()：随机唤醒一条锁对象对应线程中的一条（此线程必须是睡眠状态）
 * 注意：notify()也是锁对象来调用，并不是当前线程对象调用
 *
 * 因为wait需要释放锁，所以必须在synchronized中使用，没有锁时使用会抛出IllegalMonitorStateException（正在等待的对象没有锁）
 *
 * tips：
 * 1，wait方法与notify方法必须要由同一个锁对象调用。因为：对应的锁对象可以通过notify唤醒使用同一个锁对象调用的wait方法后的线程。
 * 2，wait方法与notify方法是属于Object类的方法的。因为：锁对象可以是任意对象，而任意对象的所属类都是继承了Object类的。
 * 3，wait方法与notify方法必须要在同步代码块或者是同步函数中使用。因为：必须要通过锁对象调用这2个方法。
 *
 * public final native void notify()：唤醒在当前锁对象中随机的一条线程
 * public final native void notifyAll()：唤醒当前锁对象对应的所有线程（效率低）
 */
public class Demo01 {
    public static void main(String[] args) {
        Shower s = new Shower();

        new Thread() {
            @Override
            public void run() {
                try {
                    s.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    s.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

class Shower {
    int count = 1;

    public  void show1() throws InterruptedException {
        for(int i = 0; i < 20; i++) {
            synchronized (Object.class) {
                while (count != 1) {
                    Object.class.wait();
                }

                Thread.sleep(10);
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();

                count = 2;
                Object.class.notify();
            }
        }
    }

    public void show2() throws InterruptedException {
        for(int i = 0; i < 20; i++) {
            synchronized (Object.class) {
                while (count != 2) {
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count = 1;
                Object.class.notify();  //随机唤醒一条当前锁的线程
            }
        }
    }
}
