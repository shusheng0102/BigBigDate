package cn.tedu.day14.exception;

import java.text.ParseException;

public class ExceptionDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException, ParseException {
        //ArithmeticException---算术异常
        try{
            System.out.println(1/0);
        }catch(Exception e){

        }

        //int[] arr=new int[3];
        //ArrayIndexOutOfBoundsException---数组下标越界异常
        //System.out.println(arr[5]);
       /* String str=null;
        //NullPointerException
        System.out.println(str.hashCode());*/
       //ClassCastException---类型转换异常
       /* A a=new B();
        C c=(C)a;*/
       //CloneNotSupportedException ---克隆不支持异常
        //new ExceptionDemo1().clone();
        //NumberFormatException---数字格式异常
        //int i=new Integer("ox123");
        //ParseException---解析异常
        //new SimpleDateFormat().parse("sbc");
    }
}

class A{}

class B extends A {}

class C extends A {}
