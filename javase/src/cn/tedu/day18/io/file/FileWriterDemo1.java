package cn.tedu.day18.io.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //创建文件字符输出流的对象·
        //会检测这个路劲是否存在
        //如果路径存在，但是没有相应的文件，就会自动创建一个空文件
        //如果路径存在，但是文件也存在即使文件里有内容也会创建空文件进行覆盖
        //如果后面的布尔值为true表明可以进行追加结果，如果不写默认就是false
        FileWriter writer=new FileWriter("D:\\a.txt",true);


        //往文件写入数据
        //在底层进行数据传输时是采用缓冲区进行数据传输
        //缓冲区规定只有存满才往外传输
        //如果数据没有存满缓冲区就会滞留在缓冲区发生数据丢失
        writer.write("您好");


        //冲刷缓冲区
        //不管缓冲区里有没有数据都会进行传输
        writer.flush();


        //关流
        //会有自动冲刷缓冲区
        writer.close();


        //把对象置为null
        //因为数据已经传输完毕需要清除对象的指向
        writer=null;
    }
}
