package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
		
		method1(arr);
		
		System.out.println(arr[0]); // 2?? 3?? : 3
	}
	
	public static void method1(int[] arr) { // 값만 복사함
		arr = new int[]	{3, 5, 7};
	}
}