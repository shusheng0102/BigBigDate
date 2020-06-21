package cn.tedu.day14.time;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //创建时间日期类对象
        //d对象---年月日，时分秒，时区
        //获取当前时间和日期
        //Date d=new Date();
        //指定的时间和日期
        //会在参数的基础上加上1900年1月
        //加上黑线的内容表示已经过时，在未来的新版本中会删除掉
        //建议不使用过时的内容

        //警告压制---把警告的内容压制住不展示
        @SuppressWarnings("deprecation")
        Date d=new Date(2008-1900,8-1,8);
        //CST---China Standard Time  中国标准时区（上海）
        System.out.println(d);
    }
}
