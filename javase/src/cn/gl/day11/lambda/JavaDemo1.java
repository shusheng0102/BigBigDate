package cn.gl.day11.lambda;

import java.util.Arrays;

public class JavaDemo1 {

    public static void main(String[] args) {
        //数组
        int[] arr={5,2,0,1,8,4};
        //Lambda表达式
        //Aarrays a=(int[] arr)->{Arrays.sort(arr);};
        //重写的方法体只有一句话省略{}
        //Aarrays a=(int[] arr)->Arrays.sort(arr);
        //从前往后推导出参数的数据类型
        //Aarrays a=(arr)->Arrays.sort(arr);
        //如果参数列表只有一个参数就能省略()
        //Aarrays a=arr->Arrays.sort(arr);
        //从前往后只有一个参数参与
        //::  调用方法，传递参数
        Aarrays a=Arrays::sort;
        //数组排序
        a.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}


//函数式接口
interface Aarrays{
    //排序---抽象方法
    void sort(int[] arr);

}
