package ch18.lecture.p06buffered;

import java.io.*;

public class C02OutputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";

		try (OutputStream fos = new FileOutputStream(name);) {
			long start = System.nanoTime();
			for (int i = 0; i < 1000_000; i++) {
				fos.write(1);
			}
			
			fos.flush();
			long end = System.nanoTime();
			
			System.out.println((end - start) + "ns");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
