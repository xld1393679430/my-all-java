package com.demos.javase.day13.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的使用
 *
 * public static ExecutorService newFixedThreadPool(int nThreads)：返回线程池对象。
 * public Future<?> submit(Runnable task)：获取线程池中的某一个线程对象，并执行
 */
public class Demo02 {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2); // 包含2个线程池对象

        // 创建Runnable实例对象
        MyRunnable task = new MyRunnable();

        // 从线程池中获取线程对象 然后调用MyRunnable中的run()
        threadPool.submit(task);
        // 再获取两个个线程对象 调用MyRunnable中的run()
        threadPool.submit(task);
        threadPool.submit(task);

        // 注意 submit方法调用结束后 程序并不终止 是因为线程池控制了线程的关闭
        // 将使用完的线程又归还到了线程池中
        // 关闭线程池
        threadPool.shutdown();
    }
}
