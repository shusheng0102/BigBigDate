package cn.tedu.day13.baozhuang;

public class BZDemo1 {
    public static void main(String[] args) {
        //基本数据类型变量
        int i=1;
        //根据基本类型数据构建出了包装类的对象---封箱
        /*Integer in=new Integer(i);
        //创建字符包装类对象
        Character c=new Character('a');*/

        //把基本类型的数据直接赋值给包装类的对象---自动封箱---jdk1.5的新特性
        //Integer in=Integer.valueOf(i);
        //包装类.valueOf(基本类型数据);
       /* Integer in=i;
        //Double d=Double.valueOf(3.4);
        Double d=3.4;//不能给定其他类型的值*/



       //封箱
        Integer in1=new Integer(1);
        //把包装类的对象直接赋值给对应的基本类型---自动拆箱---jdk1.5新特性
        //int i1=in1.intValue();
        //包装类对象.xxxValue()---把包装类对象赋值给基本数据类型
        int i1=in1;
        Double d1=new Double(3.4);
        //d1.doubleValue();
        double d2=d1;
        //
        System.out.println(i1);
    }
}
