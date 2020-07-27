package cn.gl.day22.reflect;

public class ClassDemo6 {
    public static void main(String[] args) {
        /*Class<String> clz=String.class;
        //获取实现的接口
        Class<String>[] cs= (Class<String>[]) clz.getInterfaces();
        //遍历数组
        for(Class<String> c:cs){
            System.out.println(c);
        }*/

        //
//        Object o=new Object(){};
////        Class<Object> clz= (Class<Object>) o.getClass();
////        //判断是否是匿名内部类
////        System.out.println(clz.isAnonymousClass());


        //
        Class<Integer> clz=int.class;
        //判断是否是基本类型
        System.out.println(clz.isPrimitive());
    }
}
