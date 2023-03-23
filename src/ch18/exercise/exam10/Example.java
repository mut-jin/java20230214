package ch18.exercise.exam10;

import java.io.*;

public class Example {
	public static void main(String[] args) {

		// 파일명 입력 받는 코드(option)
		String origin = "output/Gerrard.jpg";
		String copy = "output/Gerrard_copy10.jpg";

		// 복사하는 코드 작성
		try (
				InputStream is = new FileInputStream(origin);
				OutputStream os = new FileOutputStream(copy);
				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			byte[] data = new byte[1024];
			int len = 0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
			
			bos.flush();
			
			System.out.println("원본 파일 경로: " + origin);
			System.out.println("복사 파일 경로: " + copy);
			System.out.println("복사가 성공되었습니다..");
		} catch (Exception e) {
			System.out.println("원본 파일 경로: " + origin);
			System.out.println("복사 파일 경로: " + copy);
			System.out.println("원본 파일이 존재하지 않습니다.");
		}

	}
}
