package ch04.sec04;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // 줄바꿈
		
		for(int i = 10; i >= 5; i--) {
			System.out.print(i + " ");
		}
	}
}
