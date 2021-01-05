package cn.tcgl.nio.channel;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
    @Test
    public void readFile()throws Exception{
        // 创建RandomAccessFile对象。指定模式为读写模式
        RandomAccessFile raf = new RandomAccessFile("F:\\a.txt", "rw");
        // 获取FileChannel对象
        FileChannel fc = raf.getChannel();
        // 创建缓冲区用于存储数据
        ByteBuffer buffer = ByteBuffer.allocate(10);
        // 记录读取的字节个数
        int len;
        // 读取数据
        while ((len = fc.read(buffer)) != -1) {
            System.out.println(new String(buffer.array(), 0, len));
            buffer.flip();
        }
        // 关流
        raf.close();

    }
    @Test
    public void copyFile() throws Exception {

        // 创建流对象指向对应的文件
        FileInputStream in = new FileInputStream("F:\\a.txt");
        FileOutputStream out = new FileOutputStream("E:\\a.txt");

        // 获取FileChannel对象
        FileChannel src = in.getChannel();
        FileChannel dest = out.getChannel();

        // 准备缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        // 读取数据，将读取到的数据写出
        while (src.read(buffer) != -1) {
            buffer.flip();
            dest.write(buffer);
            buffer.clear();
        }
        // 关流
        in.close();
        out.close();

    }

}
