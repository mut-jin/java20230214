package ch15.exersice.exam0620;

import java.util.*;

import ch06.exercise.exam20.*;

public class Exam0620 {
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int numOfAccounts = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1 -> {
				// 계좌생성
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");
				String number = scanner.next();
				System.out.print("계좌주: ");
				String name = scanner.next();
				System.out.print("초기입금액: ");
				int money = scanner.nextInt();
				
				Account account = new Account();
				account.setNumber(number);
				account.setName(name);
				account.setMoney(money);
				
				accounts.add(account);
				numOfAccounts++;
				
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				// 목록보여주기
				System.out.println("--------------");
				System.out.println("계좌목록");
				System.out.println("--------------");
				
				for (Account account : accounts) {
					System.out.printf("%7s%10s%10d%n", account.getNumber(), account.getName(), account.getMoney());
				}
			}
			case 3 -> {
				// 예금
				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");
				String number = scanner.next();
				System.out.print("예금액: ");
				int inputMoney = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서	
				for (Account account : accounts) {	
					if (account.getNumber().equals(number)) {
						int money = account.getMoney() + inputMoney;
						account.setMoney(money);
					}
				}
			}
			case 4 -> {
				// 출금
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				
				System.out.print("계좌번호: ");
				String number = scanner.next();
				System.out.print("출금액: ");
				int inputMoney = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for (Account account : accounts) {
					if (account.getNumber().equals(number)) {
						int money = account.getMoney() - inputMoney;
						account.setMoney(money);
					}
				}
				System.out.println("출금이 성공되었습니다.");
			}
			case 5 -> {
				// 종료
				run = false;
			}
			}
		}
		System.out.println("프로그램 종료");
	}
}
