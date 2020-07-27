package cn.gl.day19.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

    public static void main(String[] args) throws IOException {
        //创建Properties映射类得对象
        Properties p=new Properties();
        //往映射对象中添加元素---键值对
        p.setProperty("name","lili");
        p.setProperty("age","10");
        p.setProperty("gender","女");
        //p.setProperty(null,null);不可以
       //把映射对象中的内容持久化到一个properties文件里
        //一定要写在.properties的文件
        p.store(new FileOutputStream("p.properties"),"这是我朋友!!!");

    }
}
