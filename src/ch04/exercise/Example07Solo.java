package ch04.exercise;

import java.util.Scanner;

public class Example07Solo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			case "1" -> {
				System.out.print("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;	
			}
			case "2" -> {
				System.out.print("출금액>");
				int money = Integer.parseInt(scanner.nextLine());
				if ((balance-money) < 0) {
					System.out.println("잔액 부족");
					continue;
				} else {
					balance -= money;	
				}
			}
			case "3" -> {
				System.out.println("잔고>"+ balance);	
			}
			case "4" -> {
				run = false;
			}
				
			}
		}
	}
}
