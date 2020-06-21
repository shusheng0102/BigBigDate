package cn.tedu.day12.string;

public class StringDemo2 {
    public static void main(String[] args) {
        //从1970年1月1日到现在的毫秒值
        long start=System.currentTimeMillis();
        //1.用+拼接
        /*String s="";
        for(int i=0;i<100000;i++){
            s+="a";
        }*/
        //2.用StringBuilder来拼接
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10000000;i++){
            sb.append("a");
        }
        String s=sb.toString();
        long end=System.currentTimeMillis();
        //程序执行时间
        System.out.println(end-start);
    }
}
