package ch18.sec03.exam03;

import java.io.*;

public class C07inputStream {
	public static void main(String[] args) {
		String src = "output/Gerrard.jpg";
		String des = "output/Gerrard_copy3.jpg";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
			is.transferTo(os); // 한줄로 대체
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사 완료!");
	}
}
