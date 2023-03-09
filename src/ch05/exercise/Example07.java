package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {
//		int[] array = { 1, 5, 3, 8, 2 };
//		
//		int max = 0;
//		for(int i = 0; i < array.length; i++) {
//			if (max <
//					array[i]) {
//				max = array[i];
//			}
//		}
//		System.out.println(max);
		int max = 0;
		
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]); 
		}
		
		System.out.println(max);
	}
}