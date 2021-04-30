package cn.gl.day18.io.file;

import java.io.FileWriter;

/**
 * 1.7新出现简写，自动关流
 */
public class FileWriterDemo3 {
    public static void main(String[] args) {
        //从jdk1.7出现的--- try-with-main.resources
        //自动进行关流
        try(FileWriter writer=new FileWriter("D:\\2.txt")){
            writer.write("anc");
        }catch (Exception e){

        }
    }
}
