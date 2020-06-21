package cn.tedu.day06.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //通过方法名和参数列表共同作用---方法签名可以调用确定的方法
        //对于重载调用时应该提供精确匹配
        //如果没有精确匹配的方法重载方法只能调用相对精确
        //如果出现多个同级相对精确的重载方法---代码报错，调用不到
        System.out.println(sum(1,2));
    }

    //求和
    //sum(int,int)---方法签名
   /* public static int sum(int n,int m){//精确匹配的方法
        System.out.println("int int");
        return m+n;
    }*/
    //sum(int,double)---方法签名
    public static double sum(int n,double m){//相对精确匹配的方法
        System.out.println("int double");
        return m+n;
    }

   /* public static double sum(double n,int m){
        return m+n;
    }*/
   /* //sum(double,double)---方法签名
    public static double sum(double n,double m){//相对精确匹配的方法
        System.out.println("double double");
        return m+n;
    }*/
}
