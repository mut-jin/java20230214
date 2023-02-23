package codetest.baekjoon;

import java.util.Scanner;

public class Main1152 {
	public static void main(String[] args) {
//		String input = "The Curious Case of Benjamin Button";
		
		Scanner scanner = new Scanner(System.in);
		
//		String input = scanner.nextLine();
		
		
//		String[] num = input.split(" ");
//		int cnt = num.length;
//		
//		System.out.println(cnt);
		
		String line = scanner.nextLine();
		
		String[] arr = line.split(" ");
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
