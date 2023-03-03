package ch06.exercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		Account name = new Account();
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			switch(menu) {
				case 1 -> {
					// 계좌생성
					System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					System.out.print("계좌번호: ");
//					account.getAccount(scanner.nextLine());
					System.out.print("계좌주: ");
//					name.getName(scanner.next());
					System.out.print("초기입금액: ");
					
					System.out.println("결과: 계좌가 생성되었습니다.");
					
				}
				case 2 -> {
					// 계좌 목록 (계좌번호, 이름, 잔금 보여주기)
					System.out.println("----------");
					System.out.println("계좌목록");
					System.out.println("----------");
//					System.out.println(account);
				}
				
				case 3 -> {
					// 계좌번호 입력하면 얼마나 예금할 것인지
					System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
//					System.out.println("계좌번호: " + account);
//					System.out.println("예금액: " + in);
				}
				
				case 4 -> {
					// 출금 : 계좌번호 입력하고 얼마나 출금할 것인지
//					System.out.println("계좌번호: " + account);
//					System.out.println("출금액: " +);
//					System.out.println("결과: ");
				}
				
				case 5 -> {
					// 프로그램 종료
				}
			}
			
		}
	}
}
