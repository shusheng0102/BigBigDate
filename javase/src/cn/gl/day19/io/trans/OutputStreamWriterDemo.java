package cn.gl.day19.io.trans;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {

		// 在构建转换输出流的时候需要传入一个字节流
		// OutputStreamWriter负责将字符转化为字节
		// 然后FileOutputStream负责将字节写到文件
		// 在转换的时候默认是使用当前工程的编码
		// OutputStreamWriter out = new OutputStreamWriter(new
		// FileOutputStream("D:\\a.txt"));
		OutputStreamWriter out = 
				new OutputStreamWriter(
						new FileOutputStream("D:\\a.txt"), "utf-8");

		out.write("ת����");

		out.close();

	}

}
