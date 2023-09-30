package com.demos.javase.day12.demo02;

/**
 * 使用Runnable创建线程
 * 1,定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
 * 2,创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
 * 3,调用线程对象的start()方法来启动线程；
 *
 * Thread和Runnable的区别
 * 如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享。
 *
 * 总结：
 *
 * 实现Runnable接口比继承Thread类所具有的优势：
 *
 * 适合多个相同的程序代码的线程去共享同一个资源。
 * 可以避免java中的单继承的局限性。
 * 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
 * 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。
 *
 * 扩充：在Java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。
 * 因为每当使用Java命令执行一个类的时候，实际上都会启动一个JVM，每一个JVM其实在就是在操作系统中启动了一个进程。
 */
public class Demo02 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();

        // 将任务对象传递给线程执行
        Thread thread = new Thread(runnable, "线程1");

        // 开启线程
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程执行： " + i);
        }
    }
}
