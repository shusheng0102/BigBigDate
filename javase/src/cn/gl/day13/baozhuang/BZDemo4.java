package cn.gl.day13.baozhuang;

public class BZDemo4 {

    public static void main(String[] args) {
        //给定整数值包装类对象的哈希码值就返回多少
        System.out.println(new Integer(3).hashCode());
        //给定整数值包装类对象的哈希码值就返回多少
        System.out.println(new Byte((byte)3).hashCode());
        //给定整数值包装类对象的哈希码值就返回多少
        System.out.println(new Short((short)3).hashCode());
        //给定整数值包装类对象的哈希码值就返回多少
        System.out.println(new Character('a').hashCode());
        //给定整数值包装类对象的哈希码值就返回多少(在int取值范围内)
        //超过int范围返回的还是一个固定值
        System.out.println(new Long(4L).hashCode());
        //返回的还是一个固定值
        System.out.println(new Float(3.4F).hashCode());
        //返回的还是一个固定值
        System.out.println(new Double(3.4).hashCode());
        //true返回的是1231  false返回的是1237
        System.out.println(new Boolean(true).hashCode());
        //整型数值移位位数，拿移动的位数对32进行取余，取余之后的结构才是真正移位的位数
        System.out.println(3>>34);

        //NaN---Not A Number---不是一个数
        //自己和自己都不相等
        System.out.println(0.0/0);
        System.out.println(Double.NaN==Double.NaN);

    }
}
