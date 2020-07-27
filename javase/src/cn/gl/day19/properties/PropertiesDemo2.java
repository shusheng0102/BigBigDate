package cn.gl.day19.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //创建映射类对象
        Properties p=new Properties();
        //反序列化----读取文件内容---把获取的内容放到映射对象身上
        p.load(new FileInputStream("p.properties"));
        //根据对象身上键获取值
        System.out.println(p.getProperty("gender"));
        //如果给定的键不存在返回的就是null
        //如果返回的值是null，表明键不存在
       /* System.out.println(p.getProperty("ame"));
        System.out.println(p.getProperty("age"));*/
       //列出映射信息---文件信息
        p.list(System.out);
    }
}
