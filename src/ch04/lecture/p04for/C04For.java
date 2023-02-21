package ch04.lecture.p04for;

public class C04For {
	public static void main(String[] args) {
		// 중첩된 for
		for(int j = 2; j <= 9; j++) {
			System.out.println(j + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", j, i, (j*i));	
			}
		}
	}
}
