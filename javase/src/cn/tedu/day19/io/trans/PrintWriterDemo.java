package cn.tedu.day19.io.trans;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("D:\\b.txt");

		// pw.write("abc\r\n");
		// pw.write("def");

		// 打印并换行
		// 在换行的时候屏蔽了不同操作系统的差异性
		pw.println("abc");
		pw.println("def");
		// 在打印对象的时候调用String.valueOf将对象转化为字符串
		pw.println(new Object());
		pw.println(new char[] { 'a', 'b', 'c' });

		pw.close();

	}

}
