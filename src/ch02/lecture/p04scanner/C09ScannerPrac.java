package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09ScannerPrac {
	public static void main(String[] args) {
		String input = """
				
				""";
		
//		Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		if (grade > 100 ) {
			System.out.println("Error");
		} else if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else if (grade <= 59) {
			System.out.println("F");
		}
	}
}
