package cn.tedu.day09.staticx;

public class StaticText3 {
    public static void main(String[] args) {
        System.out.println(STDemo.x+","+ STDemo.y);
    }
}

class STDemo{
    /*        加载      执行第一句    执行第二句    执行第三句
    * st      null      0x0103       0x0103       0x0103
    * x       0           1           1            1
    * y       0           1           1            1
    * */
    static STDemo st = new STDemo();//只加载一次
    static int x = 1;
    static int y;

    public STDemo() {
        x++;
        y++;
    }
}
