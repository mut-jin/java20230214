package ch03.exercise;

public class Example01 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31
		System.out.println(x); // 11
		System.out.println(y); // 19
	}
}
