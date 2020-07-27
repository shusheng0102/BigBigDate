package cn.gl.day17.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //创建代表文件或者目录类的对象
        //仅仅只是指定后面的路径信息
        //不检测这个路径信息是否存在
        File file=new File("D:\\a.txt");//\\转义\
        //根据指定的路劲  创建新文件
        //如果指定的路径下没有此文件就直接创建空文件
        //如果指定的路径下已有文件（无论有无内容），返回false
        //boolean b=file.createNewFile();

        //创建文件夹---也可以创建多级
        //boolean b=file.mkdirs();

        //只能删除空目录
        //无论文件是否含有内容都可以进行删除
        //彻底删除---慎重
        boolean b=file.delete();
        //
        System.out.println(b);

    }
}
