package cn.gl.day12.string;

public class StringDemo5 {
    public static void main(String[] args) {
        /*//字符串对象
        String str="shf3hvsds";
        //判断新字符串是否是原串的子串
        //子串---字符串中的内容包含而且连续
        System.out.println(str.contains("shf3hvsds"));*/

        //
        String str="xxxxx.avi";
        //判断原串是否以新串结尾
        System.out.println(str.endsWith("gv"));
        //找电影后缀名
        //文件类型  .txt  .doc   .ppt
        System.out.println(str.endsWith(".avi"));


        //判断原串是否以新串开始
        //火车   G   Z    T
        //车牌号  京   粤   鄂
        System.out.println(str.startsWith("xx"));

    }
}
