package com.demos.javase.day08.demo03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 请使用日期时间相关的API，计算出一个人已经出生了多少天。
 * 1.获取当前时间对应的毫秒值
 * 2.获取自己出生日期对应的毫秒值
 * 3.两个时间相减（当前时间– 出生日期）
 * <p>
 * 注意 -> SimpleDateFormat的parse()得到的年份少一年，月份和日期都不对
 * 没错，你就是关于年份的大小写错了。yyyy写成了YYYY，其他地方大小写错误也会引发。
 * 正确的对应关系：
 * 年 ：y
 * 月：M
 * 日：d
 * 时：H
 * 分：m
 * 秒：s
 */
public class Demo03 {
    public static void main(String[] args) throws ParseException {
        String format = "yyyy-MM-dd";
        System.out.println("请输入出生日期，格式： " + format);
        String input = new Scanner(System.in).nextLine();

        DateFormat df = new SimpleDateFormat(format);
        Date birthdayDate = df.parse(input);

        // 获取今天的日期
        Date todayDate = new Date();

        long diff = todayDate.getTime() - birthdayDate.getTime();

        if (diff < 0) {
            System.out.println("还没出生");
        } else {
            int day = (int) Math.ceil(diff / 1000 / 60 / 60 / 24);

            System.out.println("你出生了" + day + "天");
        }
    }
}
