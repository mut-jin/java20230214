package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	// 백준 1008번
	public static void main(String[] args) {
		String input = """
				1 3
				""";
		
		Scanner scanner = new Scanner(input);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double res = ((double) a / b);
		System.out.println(res);
	}
}
