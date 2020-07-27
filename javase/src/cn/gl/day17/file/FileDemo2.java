package cn.gl.day17.file;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {
        //创建文件类对象
        File file=new File("D:\\");
        //获取当前位置下的所有文件以及目录
        /*File[] fs=file.listFiles();
        for (File i:fs){
            System.out.println(i);
        }*/

        //判断是否是目录（文件夹）
        System.out.println(file.isDirectory());
        //判断是否是文件
        System.out.println(file.isFile());

    }
}
