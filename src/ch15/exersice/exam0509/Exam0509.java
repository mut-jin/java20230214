package ch15.exersice.exam0509;

import java.util.*;

import ch15.sec02.exam01.*;

public class Exam0509 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();
		boolean run = true;
		int numOfStudent = 0;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1 -> {
				// 학생 수 입력
				System.out.print("학생수> ");
				numOfStudent = scanner.nextInt();
				}
			case 2 -> {
				for(int i = 0; i < numOfStudent; i++) {
					System.out.println("scores[" + i + "]>");
					int score = scanner.nextInt();
					scores.add(score);
				}
			}
			case 3 -> {
				for (int i = 0; i < numOfStudent; i++) {
					System.out.println("scores[" + i + "]:" + scores.get(i));
				}
			}
			case 4 -> {
				int max = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.size(); i++) {
					if(max < scores.get(i)) {
						max = scores.get(i);
					}
					avg += scores.get(i);
				}
				
				avg /= scores.size();
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}
			case 5 -> {
				run = false;
			}
			}
		}
		System.out.println("프로그램 종료");
	}
}
