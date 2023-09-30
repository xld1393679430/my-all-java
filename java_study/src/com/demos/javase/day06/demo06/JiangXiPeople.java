package com.demos.javase.day06.demo06;

public class JiangXiPeople extends People implements ChiLa{
    @Override
    public void chila() {
        System.out.println("江西人吃辣");
    }

    @Override
    public void travel(Travel travel) {
        travel.journey();;
    }
}
