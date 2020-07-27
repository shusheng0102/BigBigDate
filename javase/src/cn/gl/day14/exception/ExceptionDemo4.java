package cn.gl.day14.exception;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        m();
    }

    public static void m(){
        try{
            System.out.println(1/0);
            System.out.println("try");//上面的代码出现异常就会被catch捕获直接走catch块
        }catch (Exception e){//如果try块里没有异常就不会捕获就不执行catch块里内容
            System.out.println("catch");
        }finally {
            System.out.println("finally");//无论try块里是否有异常都会执行
        }

    }
}
