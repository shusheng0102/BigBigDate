package cn.gl.day19.io.trans;

import java.io.IOException;

public class SystemDemo {

	public static void main(String[] args) throws IOException {

		// 读取的数据是以字节形式来传输的，但是返回值是int
		int i = System.in.read();

		// 标准输出流的结果是黑色
		// 标准错误流的结果是红色
		// 习惯上正常结果用输出流，错误/异常用错误流
		// 线程并发问题
		System.out.println(i);
		System.err.println(i);

	}

}
