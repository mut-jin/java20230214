package ch02.lecture.p05print;

import java.util.Scanner;

public class C06Print {
	public static void main(String[] args) {
		// 백준 3003
		String input = """
				2 1 2 1 2 1
				""";
		Scanner scanner = new Scanner(input);
		
		int king = scanner.nextInt();
		int queen = scanner.nextInt();
		int rook = scanner.nextInt();
		int bishop = scanner.nextInt();
		int knight = scanner.nextInt();
		int pawn = scanner.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", 
				(1-king), 
				(1-queen), 
				(2-rook), 
				(2-bishop), 
				(2-knight), 
				(8-pawn));
	}
}
