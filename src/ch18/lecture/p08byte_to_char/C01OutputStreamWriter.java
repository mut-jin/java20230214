package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write('a');
		os.write('b');
		osw.write('한');
		
		osw.close();
	}
	
	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
