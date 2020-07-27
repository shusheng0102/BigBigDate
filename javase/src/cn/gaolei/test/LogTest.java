package cn.gaolei.test;

import java.util.logging.Logger;

/**
 * @author 冷夜雨花未眠
 * @create 2020/7/25 0025-19:05
 */
public class LogTest {
    public static void main(String[] args) {
        System.out.println("it's a start program.");
        A a = new A();
        System.out.println("创建A对象");
        Thread t1 = new Thread(a);
        t1.setName("thread-t1");
        System.out.println("创建线程t1"+t1.currentThread().getName());
        Logger t11 = Logger.getLogger("t1");

    }
}
class A implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("class A run()方法");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}