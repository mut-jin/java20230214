package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1~100까지 3의 배수의 총합
		int sum2 = 0;
		
		for(int i = 0; i <= 100; i += 3) {
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
