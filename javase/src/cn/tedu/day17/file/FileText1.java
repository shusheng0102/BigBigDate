package cn.tedu.day17.file;

import java.io.File;

//删除目录
public class FileText1 {
    public static void main(String[] args) {
        //创建文件对象指向要删除的目录
        File file=new File("D:\\workspace");
        //调用递归方法进行删除
        deleFile(file);
    }
    //删除目录的方法---通过递归
    public static void deleFile(File file){
        //判断是否是文件夹
        if (file.isDirectory()){
            //如果是文件夹---把文件夹里的内容展开---获取里面的文件和文件夹
            File[] fs=file.listFiles();//把文件和文件夹放到数组
            //遍历数组
            for (File f:fs){//f代表的就是当前文件夹下所有的文件或者文件夹
                //把里面所有的File对象---f传到递归方法中
                deleFile(f);
            }
        }
        //删除空目录---删除文件
        file.delete();
    }
}
