package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = {9, 8, 7, 1, 2};
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		for(int n : arr1) {
			System.out.println(n);
		}
		
		// ctrl + shift + o
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"java", "hello", "friday", "sunday"};
		System.out.println(Arrays.toString(arr2));
	}
}