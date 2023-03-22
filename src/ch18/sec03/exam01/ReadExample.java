package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("output/test1.db");) {
			int data = 0;

			while ((data = is.read()) != -1) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
