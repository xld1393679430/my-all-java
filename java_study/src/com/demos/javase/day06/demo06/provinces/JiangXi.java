package com.demos.javase.day06.demo06.provinces;
import com.demos.javase.day06.demo06.Travel;

public class JiangXi implements Travel {
    @Override
    public void journey() {
        System.out.println("JiangXi -- 南昌滕王阁~");
        System.out.println("JiangXi -- 千年瓷都景德镇~");
        System.out.println("JiangXi -- 庐山风景区~");
        System.out.println("JiangXi -- 八一纪念碑~");
        System.out.println("JiangXi -- 婺源风景区~");
    }
}
