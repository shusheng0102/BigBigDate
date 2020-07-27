package cn.gl.day14.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //1把字符串转成日期
        //字符串
        /*String str="2012-12-12 12:12:12";
        //创建SimpleDateFormat对象
        //日期  2012/12/12  2012,12,12
        //指定转换的日期格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //把字符串转成日期对象
        //ParseException---解析异常
        Date d =sdf.parse(str);*/



        //2.把日期转成字符串
        //日期
        Date d=new Date();//表示此时的日期和时间
        //创建SimpleDateFormat对象
        //指定格式
        SimpleDateFormat sdf=new SimpleDateFormat
                ("yyyy年MM月dd日 HH时mm分ss秒");
        //把日期对象转成字符串对象
        String s=sdf.format(d);
        //
        System.out.println(s);
    }
}
