package com.demos.javase.day08.demo04;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar为抽象类，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象
 *
 * 常用方法
 * public int get(int field)：返回给定日历字段的值。
 * public void set(int field, int value)：将给定的日历字段设置为给定值。
 * public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 * public long getTimeInMillis()：获取1970年到当前时间的毫秒值；
 *
 * add方法 add方法可以对指定日历字段的值进行加减操作，如果第二个参数为正数则加上偏移量，如果为负数则减去偏移量
 *
 * getTime方法 Calendar中的getTime方法并不是获取毫秒时刻，而是拿到对应的Date对象
 */
public class Demo04 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH ) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));  // 0-11,4代表5月,5代表6月
        System.out.println("星期几：" + cal.get(Calendar.DAY_OF_WEEK)); // 0-6,0代表星期六,1代表星期天
        System.out.println("一个月第几周：" + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));

        System.out.println("--------------------------------");

        cal.set(Calendar.YEAR, 2020);
        System.out.println("新设置的年份是：" + cal.get(Calendar.YEAR));

        System.out.println("--------------------------------");

        cal.add(Calendar.YEAR, 2);
        System.out.println("加两年是：" + cal.get(Calendar.YEAR));

        System.out.println("--------------------------------");

        Date date = cal.getTime();
        System.out.println("getTime：" + date);

    }
}
