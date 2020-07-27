package cn.gl.day14.exception;

public class ExceptionDemo5 {

    public static void main(String[] args) {

    }

    public static int m(){
        //无论try块里是否有异常都能有返回值进行返回
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            System.out.println(1);//无论最后返回值是几都会执行代码
        }
        //return 1;代码执行不到---上面已经有返回值
    }
}
