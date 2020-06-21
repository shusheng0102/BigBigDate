package cn.tedu.day17.file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //
        File file=new File("D:\\Users\\a.txt");
        //获取文件名
        System.out.println(file.getName());
        //当前文件所在的位置
        System.out.println(file.getParent());
        //返回文件路劲以及文件名
        System.out.println(file.getPath());
    }
}
