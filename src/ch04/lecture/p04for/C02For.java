package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		// 변수 scope
		
		int i = 0;
		while (i < 3) {
			System.out.println("while loop");
			i++;
		}
		
		int j = 0; // 이렇게도 선언 가능
		for (; j < 3; j++) {
			System.out.println("for loop");
		}
		
		System.out.println(i);
//		System.out.println(j); // for문 안에 있는 j는 출력 불가
	}
}
