package cn.gl.day19.io.trans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetLineExer {
	
	public static void main(String[] args) throws IOException {

		// 从控制台读取一行数据
		// 数据最终形式是一行数据 --- BufferedReader
		// 从控制台读取 --- System.in
		// System.in是字节流，BufferedReader构建的时候需要传入字符流
		// 流关闭之后不能再次开启
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		String line = br.readLine();
		System.out.println(line);
		
	}

}
