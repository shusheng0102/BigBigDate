package cn.gl.day09.finalx;

public class FinalDemo1 {

    public static void main(String[] args) {
        //int i看成引用，加上final之后引用指向的数据无法改变---常量
        final int i;//声明
        i=2;//初始化
        //i++;//i的值不能改变
        final int[] arr={1,6,5,9};//不能改变的是arr的地址值
        arr[0]=10;//元素值可以改变
        //arr.length=10;//数组长度被final修饰
    }
}
