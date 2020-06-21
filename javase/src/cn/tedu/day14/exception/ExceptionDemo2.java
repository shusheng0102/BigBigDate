package cn.tedu.day14.exception;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        //调用方法读取文件中的内容
        try {//可能会出错的代码放到try块里
            String result=readFile(null);//参数就是文件的路劲
        } catch (PathNotExitsException e) {//把检测到的异常进行捕获处理
            //e对象就是下面方法抛出的自定义异常类的对象
            System.out.println(e.getMessage());
        }catch (FileNotExitsException e){//多个抛出的异常可以多个catch进行捕获
            System.out.println(e.getMessage());//父类的方法
        }catch (NullPointerException e){//可以处理运行时异常
            //打印异常报错信息的栈轨迹
            e.printStackTrace();
        }

        /*try {//可能会出错的代码放到try块里
            String result=readFile(null);//参数就是文件的路劲
            //对不同的异常进行统一处理
        } catch (Exception e) {//把检测到的异常进行捕获处理
            //e对象就是下面方法抛出的自定义异常类的对象
            System.out.println(e.getMessage());
        }*/


       /* try {//可能会出错的代码放到try块里
            String result=readFile(null);//参数就是文件的路劲
            //表示捕获一组异常，用|进行分割
        } catch (PathNotExitsException|FileNotExitsException|NullPointerException e) {//把检测到的异常进行捕获处理
            //e对象就是下面方法抛出的自定义异常类的对象
            System.out.println(e.getMessage());
        }*/


       //捕获多个异常时先捕获子类异常再捕获父类异常
       /* try {//可能会出错的代码放到try块里
            String result=readFile(null);//参数就是文件的路劲
        } catch (Exception e) {//把检测到的异常进行捕获处理
            //e对象就是下面方法抛出的自定义异常类的对象
            System.out.println(e.getMessage());
        }catch (FileNotExitsException e){//多个抛出的异常可以多个catch进行捕获
            System.out.println(e.getMessage());//父类的方法
        }catch (NullPointerException e){//可以处理运行时异常
            //打印异常报错信息的栈轨迹
            e.printStackTrace();
        }*/

        //如果异常被捕获处理后面的代码继续执行
        //代码执行到这块
        System.out.println("读取完成");
    }
    //读取文件内容的方法
    //如果方法上抛出多个异常时yong,分割
    //方法抛出多少个编译时异常就要处理多少个编译时异常
    public static String readFile(String path)throws PathNotExitsException, FileNotExitsException,NullPointerException{
        //读取文件内容

        //传过来的文件路径可能为null
        //判断参数是否为null
        if(path==null){
            throw new NullPointerException();//运行时异常  可以处理也可以不处理
        }

        //要查找的盘符不存在---把问题的信息进行反馈
        //把自定义异常类的对象往上抛出
        if(path.startsWith("W"))//判断是否以W开头的盘符
        throw new PathNotExitsException("亲，您路径不存在!!!");//编译时异常

        //查找文件过程当中文件类型不对--把问题信息进行反馈
        //判断文件后缀名是否是.txt
        if(!path.endsWith(".txt")){//进判断说明后缀名不是.txt
            //把异常类的对象进行返回
            throw new FileNotExitsException("亲，您的文件后缀名不对!!!");//编译时异常
        }
        //把文件内容进行返回
        //如果异常被抛出后面的代码都不会执行
        return "文件的内容...";
    }
}

//自定义异常类---继承Exception默认就是编译时异常
//如果自定义异常类继承RuntimeException/子类默认就是运行时异常
class PathNotExitsException extends Exception{
   /* //私有化属性---报错信息
    private String message;*/
    //有参构造
    public PathNotExitsException(String message){
        //this.message=message;
        super(message);//调用父类的有参构造
    }
   /* public String getMessage(){
        return message;
    }*/

}

class FileNotExitsException extends Exception{
    //
    public FileNotExitsException(String message){
        super(message);//调用父类的有参构造
    }
}







