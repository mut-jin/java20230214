package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		String input = """
					260000
					4
					20000 5
					30000 2
					10000 6
					5000 8""";
		
		Scanner scanner = new Scanner(input);
		
		int total = scanner.nextInt();
		int kind = scanner.nextInt();
		
		for (int i = 0; i < kind; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			total -= (num1 * num2);
		}	
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//		int total = scanner.nextInt();
//		int loop = scanner.nextInt();
//		
//		for (int i = 0; i < loop; i++) {
//			int price = scanner.nextInt();
//			int qty = scanner.nextInt();
//			
//			total -= (price * qty);
//		}
//		if (total == 0) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
	}
}
