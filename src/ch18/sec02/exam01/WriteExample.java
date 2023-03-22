package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); // 습관적으로 쓰기
			os.close(); // close를 해야 다른 곳에서 사용하기 편함, 이미 사용중인 파일입니다와 비슷
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
