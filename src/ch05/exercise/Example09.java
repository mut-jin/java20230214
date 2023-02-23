package ch05.exercise;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int scores[] = null;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1 -> {
				// 학생 수 입력
				System.out.print("학생수> ");
				int students = scanner.nextInt();
				scores = new int[students];
				
			}
			case 2 -> {
				// 점수 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				
			}
			case 3 -> {
				// 점수 리스트 출력
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			}
			case 4 -> {
				// 최고 값, 평균 값 출력
				int max = 0;
				double sum = 0;
				
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (sum / scores.length));
			}
			case 5 -> {
				// 프로그램 종료
				run = false;
				
			}
			}	
		}
		System.out.println("프로그램 종료");
	}
}
