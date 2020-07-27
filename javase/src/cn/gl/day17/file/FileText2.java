package cn.gl.day17.file;

import java.io.File;

public class FileText2 {
    private static int countClass;
    private static int countJava;
    public static void main(String[] args) {
        //指定要统计的目录
        File file=new File("D:\\Users\\tedu\\IdeaProjects");
        //调用递归方法---进行统计文件数
        countFile(file);
        //
        System.out.println(".java文件:"+countJava+",.class文件:"+countClass);
    }

    //递归方法---统计文件数
    public static void countFile(File file){
        //判断是否是文件夹
        if (file.isDirectory()){
            //把文件夹下所有的信息获取
            File[] fs=file.listFiles();
            //遍历数组
            for (File f:fs){
                countFile(f);
            }
        }else if(file.getName().endsWith(".java")){//文件  判断文件的后缀
            countJava++;
        }else if(file.getName().endsWith(".class")){
            countClass++;
        }
    }
}
