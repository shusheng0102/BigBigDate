package cn.tedu.day19.io.trans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// 创建流分别指向要合并的文件
		FileInputStream in1 = new FileInputStream("D:\\a.txt");
		FileInputStream in2 = new FileInputStream("D:\\b.txt");
		FileInputStream in3 = new FileInputStream("D:\\c.txt");

		// 创建Vector对象来存储这些要合并的流
		Vector<InputStream> v = new Vector<>();
		v.add(in1);
		v.add(in2);
		v.add(in3);

		// 产生Enumeration对象
		Enumeration<InputStream> e = v.elements();

		// 构建合并流对象
		SequenceInputStream in = new SequenceInputStream(e);

		// 创建一个输出流来指向合并后的文件
		FileOutputStream out = new FileOutputStream("D:\\union.txt");

		// 读取数据
		byte[] bs = new byte[10];
		int len = -1;
		while ((len = in.read(bs)) != -1) {
			out.write(bs, 0, len);
		}

		// 关流
		in.close();
		out.close();

	}

}
