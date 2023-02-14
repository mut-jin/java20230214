package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		// 코드 작성
		
		int temp = x;
		x = y;
		y = temp;
		
		
		System.out.println(x); // 5
		System.out.println(y); // 3
	}
}
