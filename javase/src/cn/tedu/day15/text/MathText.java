package cn.tedu.day15.text;

import java.util.Arrays;

//实现整数想乘过程
public class MathText {

    public static void main(String[] args) {
        //数组表示想乘的两个整数
        int[] arr1={5,4,3};//保证实现想乘过程---数组要逆着给数
        int[] arr2={6,5,4};
        //结果数组
        int[] result=new int[arr1.length+arr2.length];//给定长度
        //两个数组循环乘积---把每位的乘积的结果放到结果数组中
        for(int i=0;i<arr1.length;i++){//遍历arr1数组
            for(int j=0;j<arr2.length;j++){//遍历arr2数组
                //按照两个数组下标和一致进行求和
                result[i+j]+=arr1[i]*arr2[j];
            }
        }
        //保证每位上的书都是个数，进位
        for (int i=0;i<result.length-1;i++){
            //把每个元素赋值给新变量
            int temp=result[i];
            //保证每位上个位数
            result[i]=temp%10;
            //进位
            result[i+1]+=temp/10;
        }

        //输出结果
        System.out.println(Arrays.toString(result));
    }
}
