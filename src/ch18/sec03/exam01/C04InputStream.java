package ch18.sec03.exam01;

import java.io.*;
import java.util.*;

public class C04InputStream {
	public static void main(String[] args) {
		String name = "output/output6.txt";
		
		try (var is = new FileInputStream(name)) {
			byte[] arr = new byte[5];
			
			while ((is.read(arr)) != -1) {
				System.out.println(Arrays.toString(arr));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
