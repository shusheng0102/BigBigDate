package cn.gl.day12.string;

public class StringText1 {
    public static void main(String[] args) {
        //对象
        String str="werugvy34523wsy dv-";
        //表示小写英文字母
        int letter=0;
        //表示数字
        int num=0;
        //遍历字符串
        for(int i=0;i<str.length();i++){
            //获取到每个字符
            char c=str.charAt(i);
            //判断字符是否是小写英文字母
            if(c>='a'&&c<='z'){
                letter++;//判断是小写英文字母就计数
            }
            //判断字符是否是数字
            if(c>='0'&&c<='9'){
                num++;//判断是数字就计数
            }
        }
        //
        System.out.println("小写英文字母:"+letter+",数字:"+num+",其他字符:"+(str.length()-num-letter));

    }
}
