package codetest.baekjoon;

import java.util.Scanner;

public class Main9086 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int num = Integer.parseInt(scanner.nextLine());
//		
//		String str = "";
//		String[] strArray = new String [num];
//		for(int i = 1;  i <= num; i++) {
//			str = scanner.nextLine();
//			
//		}

		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB
				""";
		Scanner scanner = new Scanner(input);
		int loop = scanner.nextInt();
		for (int i = 0; i < loop; i++) {
			String str = scanner.nextLine();
			
			char first = str.charAt(0);
			char last = str.charAt(str.length() - 1);
			
			System.out.println("" + first + last);
		}

	}
}
