package cn.tedu.day14.exception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        System.out.println(m());
    }

    public static int m(){
        int i=1;
        try{
            //代码从上往下依次执行
            //return 1发现后面还有finally块，要保证块一定要执行
            //对return 1进行挂起，接着执行finally块里的信息
            //i++  i=2此时finally块内容执行完毕
            //执行完fianlly里的内容就接着执行之前挂起的内容  return 1
            //最后的返回结果就是1
            return i;
        }finally {
            i++;
            //return 2;直接执行finally内容进行return
        }
    }
}
