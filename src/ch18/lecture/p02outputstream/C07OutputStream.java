package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")) {
			// 한바이트 쓰기
			os.write(30);
			os.write(192734);
			
			// 여러바이트 쓰기
			byte[] data = {3, 3, 3, 3, 3, 3, 3, 3, 3};
			os.write(data);
			
			// 여러바이트 쓰기(배열의 일부분)
			os.write(data, 0, 3); // 3 bytes
			os.write(data, 4, 5); // 5 bytes
			os.write(data, 0, data.length); // 9 bytes
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
