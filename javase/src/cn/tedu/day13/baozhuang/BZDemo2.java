package cn.tedu.day13.baozhuang;

public class BZDemo2 {
    public static void main(String[] args) {
        //Integer.valueOf(10)
        //如果给定的整数值在-128~127范围内，前后两个包装类对象返回的是相同数组相同下标的元素值
        /*Integer in1=10;
        Integer in2=10;*/
        //范围（-128~127）
      /*  Byte.valueOf((byte)2);
        Byte in1=2;
        Byte in2=2;*/
        /*//范围（-128~127）
        Short.valueOf((short)3)
        Short in1=3;
        Short in2=3;*/
        //范围（-128~127）
       /* Long.valueOf(4L);
        Long in1=3L;
        Long in2=3L;*/
       //范围（0-127）
       /* Character.valueOf('a')
        Character in1='1';
        Character in2='1';*/
       //没有范围
       //Double.valueOf(3.4)
       //Double in1=3.1;

        Integer in=10;
        int i=10;
        //当包装类对象和对应的基本类型数据进行操作
        //包装类就会进行自动拆箱和基本类型数据进行操作
        System.out.println(in+i);
    }
}
