package cn.gl.day14.time;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类的对象
        Calendar c=Calendar.getInstance();
        //指定日期
        Date d=new Date(2008-1900,8-1,8);
        //改变时间
        //把指定的日期放到日历
        c.setTime(d);
        //获取日历类里的属性
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
