package codetest.baekjoon;

import java.util.Scanner;

public class Main10798 {
	public static void main(String[] args) {
		String input = """
				AABCDD
				afzz
				09121
				a8EWg6
				P5h3kx
				""";
		Scanner scanner = new Scanner(input);
		
//		String line1 = scanner.nextLine();
//		String line2 = scanner.nextLine();
//		String line3 = scanner.nextLine();
//		String line4 = scanner.nextLine();
//		String line5 = scanner.nextLine();
//		
//		String[] arr1 = line1.split("");
//		String[] arr2 = line2.split("");
//		String[] arr3 = line3.split("");
//		String[] arr4 = line4.split("");
//		String[] arr5 = line5.split("");
//		
//		String[][] whole = {arr1, arr2, arr3, arr4,a arr5};
		
		String[][] whole = new String[5][];
		for(int i = 0; i < 5; i++) {
			whole[i] = scanner.nextLine().split("");
		}
		
		// 큰길이 구하기
		int max = 0;
		for(int i = 0; i < 5; i++) {
			if(max < whole[i].length) {
				max = whole[i].length;
			}
		}
		
		int numberOfCharacter = max;
		for(int i = 0; i < numberOfCharacter; i++) {
			for(int j = 0; j < 5; j++) {
				if (i < whole[j].length) {
					System.out.print(whole[j][i]);
				}
			}
		}
	}
}
