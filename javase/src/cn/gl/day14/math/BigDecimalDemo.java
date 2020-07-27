package cn.gl.day14.math;

import java.math.BigDecimal;

public class BigDecimalDemo {
    //strictfp---把计算过程提高到80位，但是最后还是以64位进行存储
    public strictfp static void main(String[] args) {
       /* //
        double d=2.1-1.93;
        //没有精确运算
        System.out.println(d);*/

        //参数变为字符串才能进行精确运算
        BigDecimal bd1=new BigDecimal("2.1");
        BigDecimal bd2=new BigDecimal("1.93");
        //两个对象值进行相减
        System.out.println(bd1.subtract(bd2));
    }
}
