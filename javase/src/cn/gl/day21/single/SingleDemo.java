package cn.gl.day21.single;

public class SingleDemo {

    public static void main(String[] args) {
        TaskManager taskManager= TaskManager.getInctance();
        //TaskManager.m();
    }
}

//单例模式实现方式---饿汉式
//class TaskManager{
//    //私有构造方法---外部拿不到构造方法
//    private TaskManager(){}
//    //创建对象---属性私有化
//    private static TaskManager t=new TaskManager();
//    //公共的访问方式
//    public static TaskManager getInctance(){
//        return t;
//    }
//    public static void m(){
//        System.out.println(1);
//    }
//}
//单例实现方式---懒汉式
class TaskManager{
    //私有构造方法---外部拿不到构造方法
    private TaskManager(){}
    //声明对象---属性私有化
    private static TaskManager t;
    //公共的访问方式
    public static TaskManager getInctance(){
        if(t==null) {
            return t = new TaskManager();
        }
        return t;//返回的是已有地址值的对象
    }
    /*public static void m(){
        System.out.println(1);
    }*/
}
