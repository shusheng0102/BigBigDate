package cn.tedu.day22.jdk;

public class InterfaceMethod {
}

//代表计算器
interface calc{
    //求和
    //用default来修饰方法就是默认方法---实体方法
    public default int sum(int m, int n){
        return m+n;
    }
    //求大小
    //用static修饰的方法---实体方法
    public static int max(int x, int y){
        return x>y?x:y;
    }
}
