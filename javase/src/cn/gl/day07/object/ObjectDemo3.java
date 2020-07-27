package cn.gl.day07.object;

public class ObjectDemo3 {
    //属性
    int k;//变量---成员变量

    //方法
    public void m(){}
    public static void main(String[] args) {
        int k=1;//变量---局部变量
        //定义变量
        //在哪（{}）定义变量在哪使用
        /*int x=1;
        int y=2;*/
        //局部（方法）代码块---改变了变量的生命周期
        {
            int x=1;//局部变量
            int y=2;
            System.out.println(x+y);
        }
        //1000行代码与前面的x，y都没有关系
    }
}
