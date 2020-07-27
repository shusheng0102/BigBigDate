package cn.gl.day10.text;

public class StaticText {
    public static void main(String[] args) {
        System.out.println(new STDemo().x+","+new STDemo().y);
    }
}


class STDemo{
    int j;
    STDemo st=new STDemo();
    static int x=1;
    static int y;
    public STDemo(){
        x++;
        y++;
    }
}







