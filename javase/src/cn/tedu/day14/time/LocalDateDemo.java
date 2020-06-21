package cn.tedu.day14.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String[] args) {
        //获取当前的日期
        LocalDate l=LocalDate.now();
        //LocalTime---操作时间
        //LocalDateTime---操作日期和时间
        //只有日期
        //任意操作日期
        System.out.println(l.plus(2,ChronoUnit.CENTURIES));
    }
}
