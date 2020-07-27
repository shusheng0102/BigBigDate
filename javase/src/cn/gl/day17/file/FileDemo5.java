package cn.gl.day17.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo5 {
    public static void main(String[] args) {
        //
        File file=new File("D:\\");
        //对文件进行操作
        File[] fs1=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //匹配以数字开头
                return pathname.getName().matches("\\d.*");
            }
        });
       //可以直接对文件名进行操作
       File[] fs2=file.listFiles(new FilenameFilter() {
           @Override
           public boolean accept(File dir, String name) {//name就是文件名
               return name.matches("\\d.*");
           }
       });
       //晚上练习---通过Lambda表达式来实现？？？？
        //
        for(File f:fs2){
            System.out.println(f);
        }

    }
}
