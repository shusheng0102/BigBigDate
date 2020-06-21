package cn.tedu.day06.method;

public class MethodDemo4 {

    public static void main(String[] args) {
        System.out.println(diGuiSum(1000000));
    }
    //通过递归完成求和
    public  static int diGuiSum(int m){
        //结束标志
        if(m==1){
            return 1;
        }
      return   m+diGuiSum(m-1);//10+sum(9)
    }

    //通过递归完成求阶乘？？自己完成
}


