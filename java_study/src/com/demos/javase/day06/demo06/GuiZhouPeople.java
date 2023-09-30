package com.demos.javase.day06.demo06;

public class GuiZhouPeople extends People implements ChiLa, ChiSuan{
    @Override
    public void chila() {
        System.out.println("贵州人吃辣");
    }

    @Override
    public void chisuan() {
        System.out.println("贵州人吃酸");
    }

    @Override
    public void travel(Travel travel) {
        travel.journey();
    }
}
