package cn.tedu.day17.file;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        //
        File file=new File("D:\\123.doc");
        //设置文件或者目录的修改时间
        file.setLastModified(1625361253L);

        //重命名---给定新文件对象（指定新名称的位置）---前后文件的路径一致
        //如果前后文件路径不一致---剪切（同时进行重命名）
        boolean b=file.renameTo(new File("D:\\javase\\a.doc"));
        System.out.println(b);
    }
}
