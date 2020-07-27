package cn.gl.day20.thread;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CDemo c=new CDemo();
        //执行服务器
        ExecutorService es =Executors.newCachedThreadPool();
        Future<String> f =es.submit(c);
        System.out.println(f.get());//输出的返回值
    }

}

//泛型指定返回值的类型
class CDemo implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "线程执行结束!!!";
    }
}
