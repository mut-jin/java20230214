package ch02.sec13;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("X 값 입력 > ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("Y 값 입력 > ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("X + Y = " + result);
		
		while (true) {
			System.out.println("입력 문자열: ");
		}
	}
}
