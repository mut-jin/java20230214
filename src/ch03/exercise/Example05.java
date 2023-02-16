package ch03.exercise;

public class Example05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = 
		System.out.println((lengthTop + lengthBottom) * height / 2.0); // 1번보기
		System.out.println((lengthTop + lengthBottom) * height * 1.0 / 2); // 2번보기
		System.out.println((double)(lengthTop + lengthBottom) * height / 2); // 3번보기
		System.out.println((double)((lengthTop + lengthBottom) * height / 2)); // 4번보기
	}
}
