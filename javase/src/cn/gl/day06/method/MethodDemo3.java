package cn.gl.day06.method;
//java中所有的方法执行在栈中
public class MethodDemo3 {

    public static void main(String[] args) {
        //定义变量
        //int i=1;
        int[] arr={4,5,6};
        //实参---给定参数具体的值
        //如果实参是一个基本类型数据，传的是值的拷贝
        //arr[0]仍然是基本类型数据
       //m(arr[0]);
        //如果实参的数据类型是引用数据类型，那么传的就是地址值
        //n(arr);
        //如果实参是引用数据类型，传递的就是地址值的拷贝，如果拷贝的地址值没有找到原堆内存就不会有影响
        mn(arr);
        // 1
        System.out.println(arr[0]);
    }

    //
    public static void m(int j){//形参---用于接受实参的值
        j++;//操作的是拷贝值
    }

    public static void n(int[] arr){//={4,5,6}
        arr[0]=10;//拿到传过来的地址值找到对应的堆内存改变数据有影响
    }

    public static void mn(int[] arr){
        arr=new int[4];//把拷贝的地址值覆盖了
        arr[0]=10;
    }
}
