package cn.tedu.day13.string;

public class StringText {
    public static void main(String[] args) {
        //
        String str="sdgcusdvsoiwvgfs";
        //得到第一个字符  转成字符串
        //字符拼接字符串---得到含有字符值的字符串
        String s=str.charAt(0)+"";//s+""---"s"
        //下标值
        int index=0;
        //遍历字符串
        while(index<str.length()){//下标值最大取到长度减-1
            //获取第一次下标的值
            index=str.indexOf(s,index);
            //判断返回的值
            if(index!=-1){//返回的是下标值
                System.out.println(index++);//下标再加1
            }else{
                break;//后面不会再有符合条件的下标值 结束循环
            }
        }
    }
}
