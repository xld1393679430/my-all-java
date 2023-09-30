package com.demos.javase.day16.demo03;

import java.io.IOException;
import java.net.*;

/**
 * DatagramSocket类
 * java.net.DatagramSocket类用于描述一个UDP发送端或接收端；
 *
 * 常用方法
 * public void send(DatagramPacket p)：发送一个UDP数据包
 * public synchronized void receive(DatagramPacket p)：接收一个UDP数据包
 * public void close()：释放该Socket占用的资源
 *
 * UDP实现数据发送与接收
 * 发送端
 */
public class Demo03 {
    public static int port = 6869;
    public static void main(String[] args) throws IOException {
        // 锁对象
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        startServer();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        startClient();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
    }

    private static void startClient() throws IOException {
        System.out.println("---startClient---start");

        DatagramSocket socket = new DatagramSocket(port);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        //接收数据字节的长度
        System.out.println("接收端：");

        // 接收一个UDP数据包
        socket.receive(packet);

        int len = packet.getLength();
        System.out.println("已经接收到：" + len + "个字节");

        // 转换为字符串打印
        System.out.println(new String(bytes, 0, len));
        socket.close();

        System.out.println("---startClient---end");
    }

    private static void startServer() throws IOException {
        System.out.println("---startServer---start");

        String str = "你好";

        // 准备一个UDP数据
        DatagramPacket packet = new DatagramPacket(
                str.getBytes(),
                str.getBytes().length,
                InetAddress.getLocalHost(),
                port
        );

        // 套接字
        DatagramSocket socket = new DatagramSocket();

        // 发送数据包
        socket.send(packet);
        socket.close();

        System.out.println("---startServer---end");
    }
}
