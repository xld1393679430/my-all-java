package com.demos.javase.day12.demo12;

/**
 * 同步方法：使用synchronized修饰的方法，就叫做同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等着。
 *
 * 注意：同步方法也是有锁对象的，对于静态方法的锁对象的当前类的字节码对象（.class），对于非静态的方法的锁对象是this；
 */
public class Demo12 {
    public static int count = 20;

    public static void main(String[] args) {
        Shower s = new Shower();


        new Thread() {
            @Override
            public void run() {
                while (count > 0) {
                    s.show1();
                    count--;
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (count > 0) {
                    s.show2();
                    count--;
                }
            }
        };

    }
}

class Shower {
    // 非静态同步方法的锁对象默认是this
    public synchronized void show1() {
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }

    public void show2() {
        // 使用this锁也能够保证代码同步
        synchronized (this) {
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }
    }
}
