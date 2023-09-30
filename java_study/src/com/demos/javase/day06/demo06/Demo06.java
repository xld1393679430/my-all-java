package com.demos.javase.day06.demo06;

import com.demos.javase.day06.demo06.provinces.GuiZhou;
import com.demos.javase.day06.demo06.provinces.JiangXi;

/**
 * 现需设计一套程序：
 * 江西人吃辣，风景名胜有：南昌滕王阁景区、千年瓷都景德镇、庐山风景区…
 * 贵州人吃辣也吃酸，风景名胜有：黄果树瀑布、赤水丹霞旅游区、镇远古城风景区…
 * 广东人吃酸也吃甜，风景名胜有：广州白云山景区、韶关丹霞山景区、惠州罗浮山景区…
 *
 * 案例分析
 * 1）描述人类，提供姓名和年龄属性，提供自我介绍方法（intro），具备旅游方法travel，可以去不同的地方旅游，不同地方的景点也不一样；
 * 2）定义江西人、贵州人、广东人，继承人类，都会旅游；
 * 3）定义吃辣（Chili）、吃酸（Sour）、吃甜（Sweet）接口，扩展江西人吃辣（实现吃辣接口）、贵州人吃酸吃辣（实现吃酸、吃辣接口）、广东人吃酸吃甜（实现吃酸、吃甜接口）；
 * 4）定义旅游接口（Travel），具备旅行方法（journey）
 * 5）定义江西、贵州、广东三个城市类，实现旅游接口，具备旅游功能；
 */
public class Demo06 {
    public static void main(String[] args) {
        GuiZhouPeople gzp = new GuiZhouPeople();
        JiangXi jx = new JiangXi();
        gzp.travel(jx);
        gzp.chila();
        gzp.chisuan();

        System.out.println("--------");

        JiangXiPeople jxp = new JiangXiPeople();
        jxp.chila();
        jxp.travel(new GuiZhou());
    }
}
