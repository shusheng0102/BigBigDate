package cn.gl.day12.string;

public class StringDemo4 {
    public static void main(String[] args) {
       /* //字符串对象
        String str1="a437f";
        String str2="A437fr";
        //把两个字符串对应位置的字符进行求差
        //如果差值不为0就把这个差值进行返回
        //如果差值为0就继续求下一个下表对应字符的差值
        //如果其中一个字符串的长度遍历完毕就把两个字符串的长度之差进行返回
        //如果返回值是负数说明前面比后面小
        //如果返回值是正数说明前面比后面大
        //---字典排序
        System.out.println(str1.compareTo(str2));
        //忽略大小写
        System.out.println(str1.compareToIgnoreCase(str2));*/





       //字符串对象
        String str="abc";
        //把新字符串拼接到原字符串的末尾
        //+和concat拼接的区别
        //1.+底层依赖于StringBuilder来拼接，concat依赖于底层的数组复制来实现的
        //2.+可以拼接任意数据   concat只能拼接字符串
        System.out.println(str.concat("bcd"));

    }
}
