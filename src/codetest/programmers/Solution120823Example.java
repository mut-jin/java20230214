package codetest.programmers;

public class Solution120823Example {
	public static void main(String[] args) {
//		0
//		01
//		012
//		0123
//		01234
//		int num1 = 0;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print(num1);
//				num1++;
//			}
//			System.out.println();
//			num1 = 0;
//		}
//		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//		int num2 = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print(num2);
//				num2++;
//			}
//			System.out.println();
//			num2 = 1;
//		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = i; j >= 0; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		0
//		10
//		210
//		3210
//		43210
		for (int i = 0; i < 5; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
