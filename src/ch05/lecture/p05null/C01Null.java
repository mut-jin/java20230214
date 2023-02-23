package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		arr1 = null; // 참조하는 객체가 없음
		
		// 참조하는 객체 없음 예외 발생(NullPointerException)
		int len = arr1.length;
		int val = arr1[0];
		
		System.out.println("실행 흐름..");
	}
}