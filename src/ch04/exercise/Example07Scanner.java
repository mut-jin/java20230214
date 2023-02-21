package ch04.exercise;

import java.util.Scanner;

public class Example07Scanner {
	public static void main(String[] args) {
		String input = """
				1
				10000
				2
				
				""";
		Scanner scanner = new Scanner(input);
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextInt());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		
		System.out.println("종료");
	}
}
