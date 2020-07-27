package cn.gl.day22.reflect;

public class ClassDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.类名.class---字节码对象
       /* Class<String> clz=String.class;

        //基本类型的字节码对象
        Class<Integer> clz1=int.class;

        //数组的字节码对象
        Class<int[]> clz2=int[].class;

        //接口的字节码对象
        Class<List> clz3=List.class;*/


        //2.通过对象.getClass()---字节码对象
        //Class<String> clz= (Class<String>) "abc".getClass();


        //3.通过Class.forName(全路劲名)---把字符串生成对应的字节码对象
        Class<String> clz= (Class<String>) Class.forName("java.lang.String");

        System.out.println(clz);
    }
}
