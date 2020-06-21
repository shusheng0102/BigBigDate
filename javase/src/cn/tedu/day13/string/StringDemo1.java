package cn.tedu.day13.string;

public class StringDemo1 {

    public static void main(String[] args) {
        //
        String str1="abc";
        String str2=new String("Abc");
        //instanceof--关键字
        //对象 instanceof 类/接口---判断对象是否是和后面的类型有关系
        //判断的是类型是否是对象对应类型的父类、子类、本类，接口的实现类
        //判断两个字符串是否相等
        //相等的依据是先判断地址值，如果地址值不相等再判断内容是否完全一致（长度和顺序）
        System.out.println(str1.equals(str2));
        //忽略大小写进行比较
        //验证码
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
