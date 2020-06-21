package cn.tedu.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.URI;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/12 0012-12:23
 *
 * hdfs基本操作   上传  下载  删除
 */
public class HDFSDemo {
    // 下载
    @Test
    public void get() throws IOException {
        //环境配置
        Configuration conf=new Configuration();
        //1.链接HDFS
        FileSystem fs=FileSystem.get(URI.create("hdfs://hadoop01:9000"),conf);
        //2.指定读取文件
        InputStream in = fs.open(new Path("/a.txt"));  //返回一个输入流
        //3.创建输出流，将读取文件写出来
        FileOutputStream out = new FileOutputStream("D:\\output\\a.txt");
        //边读边写
        IOUtils.copyBytes(in,out,conf);
        //关流
        in.close();
        out.close();
    }
    // 上传
    @Test
    public void put() throws IOException, InterruptedException {

        //1. 环境配置
        // 凡是写在*-site.xml中配置都可以利用这个对象来指定
        Configuration conf = new Configuration();
        // 代码中的指定要优先于配置文件中内容
        // conf.set("dfs.replication", "5");
        //2. 连接HDFS
        // HDFS的权限校验：告诉它是谁它就认为是谁
        FileSystem fs = FileSystem.get(
                URI.create("hdfs://hadoop01:9000"),
                conf,
                "root"
        );
        //3. 指定文件
        OutputStream out = fs.create(new Path("/b.log"));
        //4. 创建一个输入流读取要上传的文件
        FileInputStream in = new FileInputStream("D:\\output\\ab.txt");
        IOUtils.copyBytes(in, out, conf);
        // 关流
        in.close();
        out.close();
    }
    // 删除
    @Test
    public void delete() throws IOException, InterruptedException {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(
                URI.create("hdfs://hadoop01:9000"),
                conf,
                "root"
        );
        fs.delete(new Path("/park"), true);//true表示是否需要递归删除

    }
}
