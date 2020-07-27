package cn.gl.day18.io.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

    public static void main(String[] args) throws IOException {
        //创建文件字符输入流的对象---指定要去读取文件的位置
        //会检测指定要去读取的文件是否存在
        FileReader read=new FileReader("D:\\1.txt");

        //读取数据
        //调用read()---返回值是读取到字符的对应编码值
        /*System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        //当文件没有内容可以读取时返回值是-1
        System.out.println(read.read());*/

        //把上面重复的内容变成了循环实现
        int i=-1;
        while((i=read.read())!=-1){//把每读取的内容赋值给i，再进行判断
            System.out.println(((char) i));
        }
    }
}
