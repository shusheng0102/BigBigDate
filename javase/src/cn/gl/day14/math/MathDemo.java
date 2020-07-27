package cn.gl.day14.math;

public class MathDemo {
   //private MathDemo(){}//构造方法私有化
    public static void main(String[] args) {
        //绝对值
        //System.out.println(Math.abs(-2.3));
        //（底数，次幂）---可以求任意的次幂以及开根
        //System.out.println(Math.pow(4,1.0/2));
        //向上取整
        /*System.out.println(Math.ceil(3.1));
        //向下取整
        System.out.println(Math.floor(3.6));
        //四舍五入---整型值
        System.out.println(Math.round(3.5));*/

        //返回的是从0.0（包含）到1.0伪随机小数
        //底层根据伪随机算法实现的
        //System.out.println(Math.random());
        //随机验证码
        char[] cs={'t','u','外','中','9','1','亿'};
        //用于拼接最后结果
        String str="";
        //拼接四个随机字符
        for(int i=0;i<4;i++){
            str+=cs[(int)(Math.random()*7)];//数组下标随机
        }
        System.out.println(str);
    }
}
