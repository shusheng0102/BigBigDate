package cn.tcgl.nio.channel;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 	1. FileChannel，顾名思义是面向文件的通道
 * 	2. 可以利用FileChannel完成对文件的读写操作
 * 	3. 利用FileChannel读取文件的时候，是先将文件中的内容映射到虚拟内存中，然后再读取到程序的缓冲区中
 * 	4. FileChannel不能直接创建，可以利用FileInputStream、FileOutputStream、RandomAccessFile对象中的getChannel()方法获取
 * 	5. 如果是通过FileInputStream获取FileChannel，那么只能进行读取操作
 * 	6. 如果是通过FileOutputStream获取FileChannel，那么只能进行写入操作
 *  7. 如果是通过RandomAccessFile获取FileChannel，那么可以进行读写操作
 */
public class FileChannelDemo {
    /**
     * 读取过程
     * @throws Exception
     */
    @Test
    public void readFile()throws Exception{
        // 创建RandomAccessFile对象。指定模式为读写模式
        RandomAccessFile raf = new RandomAccessFile("F:\\test\\a.txt", "rw");
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

    /**
     * 写入过程
     * @throws Exception
     */
    @Test
    public void writeFile() throws Exception {

        // 创建RandomAccessFile对象。指定模式为读写模式
        RandomAccessFile raf = new RandomAccessFile("F:\\test\\test.txt", "rw");
        // 获取FileChannel对象
        FileChannel fc = raf.getChannel();
        // 创建缓冲区，并且将数据放入缓冲区
        ByteBuffer src = ByteBuffer.wrap("hello".getBytes());
        // 利用通道写出数据
        fc.write(src);
        // 关流
        raf.close();

    }

    /**
     * 复制文件
     * @throws Exception
     */
    @Test
    public void copyFile() throws Exception {

        // 创建流对象指向对应的文件
        FileInputStream in = new FileInputStream("F:\\test\\a.txt");
        FileOutputStream out = new FileOutputStream("F:\\test\\b.txt");

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
