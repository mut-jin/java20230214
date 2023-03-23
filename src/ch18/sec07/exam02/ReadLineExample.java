package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
		
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/sec07/exam02/ReadLineExample.java";
		BufferedReader br = new BufferedReader(new FileReader(name));
			
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();
		
	}
}
