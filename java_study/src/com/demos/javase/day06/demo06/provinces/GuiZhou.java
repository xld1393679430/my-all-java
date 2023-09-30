package com.demos.javase.day06.demo06.provinces;
import com.demos.javase.day06.demo06.Travel;

public class GuiZhou implements Travel {
    @Override
    public void journey() {
        System.out.println("GuiZhou -- 黄果树瀑布~");
        System.out.println("GuiZhou -- 赤水丹霞旅游区~");
        System.out.println("GuiZhou -- 镇远古城风景区~");
        System.out.println("GuiZhou - 梵净山旅游区~");
        System.out.println("GuiZhou - 安顺龙宫风景区~");
    }
}
