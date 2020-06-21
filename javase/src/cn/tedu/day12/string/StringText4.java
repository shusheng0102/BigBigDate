package cn.tedu.day12.string;

public class StringText4 {
    public static void main(String[] args) {
        //字符串对象
        String str="wshvb2398ew28tfgh";
        //定义布尔数组表示字符串中字符状态
        boolean[] bs=new boolean[str.length()];
        //初始化元素值为true
        //true---未统计   false---已统计
        for(int i=0;i<str.length();i++){
            bs[i]=true;
        }
        //遍历字符串
        for(int i=0;i<str.length();i++){
            //判断是否已统计
            if(bs[i]){//看布尔数组元素是否为true
                //表面未统计
                //定义统计数
                int count=1;
                //获取对应字符
                char c=str.charAt(i);
                //遍历字符串后续的字符
                for(int j=i+1;j<str.length();j++){
                    //判断后续字符是否和c相等
                    if(c==str.charAt(j)){
                        //计数
                        count++;
                        //改变后续元素的状态
                        bs[j]=false;
                    }
                }
                //输出结果
                System.out.println(c+":"+count);
            }
        }
    }
}
