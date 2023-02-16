package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	// 백준 11021
	public static void main(String[] args) {
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";
		Scanner scanner = new Scanner(input);
		
		int loop = scanner.nextInt();
		
		for(int i = 1; i <= loop; i++) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			
			int sum = numA + numB;
			
			System.out.printf("Case #%2$d: %1$d%n", sum, i);
			System.out.println("Case #" + i + ": " + sum);
		}	
	}
}
