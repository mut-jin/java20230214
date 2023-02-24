package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		// 책 188 쪽
		int[] origin = {9, 8, 1, 2, 3};
		int[] target = new int[origin.length];
		
		System.arraycopy(origin, 0, target, 0, origin.length); 
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		
		origin[0] = 99;
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
	}
}
