package cn.gl.day19.io.trans;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	
	public static void main(String[] args) throws Exception {

		// 构建转换输入流的时候传入字节流
		// 真正读取数据的是字节流FileInputStream
		// FileInputStream读取到的是字节
		// InputStreamReader将读取到的字节转化字符
		InputStreamReader in = 
				new InputStreamReader(
						new FileInputStream("D:\\a.txt"));
		
		char[] cs = new char[5];
		int len = -1;
		while ((len = in.read(cs)) != -1)
			System.out.println(new String(cs, 0, len));

		in.close();
		
	}

}
