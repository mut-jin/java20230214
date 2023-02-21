package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int out = 0;
//		boolean bank = true;
//		int cash = 0;
//		int out = 0;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			
			String strNum = scanner.nextLine();
			
//			if(strNum.equals("1")) {
//				System.out.print("예금액>");
//				cash = scanner.nextInt();
//				continue;
//			} else if (strNum.equals("2")) {
//				System.out.print("출금액>");
//				out = scanner.nextInt();
//				cash = cash - out;
//				continue;
//			} else if (strNum.equals("3")) {
//				System.out.print("잔액>"+ cash);
//				continue;
//			} else if (strNum.equals("4")) {
//				bank = false;
//			}
			switch (strNum) {
			case "1" -> {
				System.out.println("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			}
			case "2" -> {
				System.out.println("출금액>");
					int money = Integer.parseInt(scanner.nextLine());
					balance -= money;
			}
			case "3" -> {
				System.out.println("잔고>" +balance);
			}
			case "4" -> {
				run = false;
			}
			}
		}
		System.out.println("프로그램 종료");
	}
}