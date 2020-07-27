package cn.gl.day12.string;

import java.util.Arrays;

public class StringText3 {
    public static void main(String[] args) {
        //字符串对象
        String str="ef4vbf54rwe2190v35r";
        //新数组---用于存储字符串中数字
        int[] arr=new int[str.length()];
        //表示新数组下标
        int index=0;
        //遍历字符串
        for(int i=0;i<str.length();i++){
            //获取每一个字符
            char c=str.charAt(i);
            //判断是否是数字
            if(c>='0'&&c<='9'){
                //把符合条件的数字字符赋值给新数组
                arr[index++]=c-'0';
            }
        }
       //缩容---保证只排序字符串中的数字
        arr=Arrays.copyOf(arr,index);
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
