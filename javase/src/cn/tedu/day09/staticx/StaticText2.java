package cn.tedu.day09.staticx;

public class StaticText2 {
    public static void main(String[] args) {
        System.out.println(new SText().i);
    }
}


class SText{
   /* int i=1;
    {
        i+=2;
    }*/

    {
        i=2;//只能赋值
    }
    int i=1;
}
