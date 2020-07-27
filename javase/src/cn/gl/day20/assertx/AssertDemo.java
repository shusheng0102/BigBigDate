package cn.gl.day20.assertx;

import java.util.Scanner;

public class AssertDemo {
    public static void main(String[] args) {
        //请输入小于10的整数
        System.out.println("请输入小于10的整数");
        int num=new Scanner(System.in).nextInt();
        num=num>>1;

        //对结果进行预测---断言
        //如果预测正确就接着执行，如果失败就报错---AssertionError
        //:后面是出现错误之后的提示
        assert num<5:"一定是输入的num值大于10";
        //
        System.out.println(num);

    }
}
