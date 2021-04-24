package cn.rumen.jingtong;

public class DemoTest {
    public static void main(String[] args) {
        int a1=22;
        int a2=022;
        int a3=0x22;
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);//8进制  2*8+2=18
        System.out.println("a3="+a3);//16进制 2*16+2=34
        float b1=123456.2F;
        float b2=1234567.2F;
        float b3=12345678.2F;
        float b4=123456789.2F;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(Math.round(b3));
        System.out.println(b4);
        float b5=1234567.25F;
        System.out.println(b5);
        float b6=7.2543245F;
        System.out.println(b6);
        double c1=4.35*100;
        System.out.println(c1);
        System.out.println(Math.round(c1));

        double a=0.1;double b=2.0-1.9;
        System.out.println(a==b);
        System.out.println(Math.abs(a-b)<1e-6);//结果为true 说明a=b
        int h=0xb01e;
        System.out.println(h);
    }
}
