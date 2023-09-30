package com.demos.javase.day16.demo04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ServerSocket
 *
 * 客户端代码：
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6969);

        // 获取与此服务器的输入流
        InputStream is = socket.getInputStream();

        // 获取此服务的输出流
        OutputStream os = socket.getOutputStream();

        // 向服务器发送数据
        os.write("在吗？".getBytes());

        // 准备发送一个字节数组用于接收数据
        byte[] bytes = new byte[1024];

        // 读取服务器发送过来的数据（若服务器一直未发送数据则程序阻塞在此）
        int len = is.read(bytes);

        System.out.println(new String(bytes, 0, len));

        // 向服务器写数据
        os.write("买糖".getBytes());

        // 读取服务器的数据
        len = is.read(bytes);

        System.out.println(new String(bytes, 0, len));

        // 释放连接资源
        socket.close();
    }
}