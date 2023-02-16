package ch03.lecture.p01arithmetic;

public class C09Increment {
	public static void main(String[] args) {
		// 증가 연산자 (++)
		// 감소 연산자 (--)
		
		int x = 1;
		int y = 1;
		
		x++; // x는 2가 됨
		++x; // x는 3이 됨
		
		y--; // y는 0이 됨
		--y; // y는 -1이 됨
		
		System.out.printf("%d, %d%n", x, y); // x:3 , y:-1
		
		int z = x++ +10; // 13
		int w = ++y + 10; // 10
		System.out.printf("%d, %d%n", z, w);
	}
}
