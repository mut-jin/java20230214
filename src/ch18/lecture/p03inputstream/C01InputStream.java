package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		// InputStream
		// byte 단위 입력 스트림
		// 주요 메소드 : read
		
		String name = "output/test3.db"; // 3bytes 크기 파일
		try (InputStream is = new FileInputStream(name)) {
			// read : 한바이트 읽기
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read()); // -1 리턴
			System.out.println(is.read()); // -1 리턴
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
