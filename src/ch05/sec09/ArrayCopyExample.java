package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 배열 항목 출력
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println();
		
		// 길이 5인 배열
		String[] arr1 = {"java", "array", "copy", "son", "park"};
		// Arrays.copyOf로 배열 복사
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// arr1[0] 변경해도
		// arr2[0] 변경되지 않음
		// 참조값이 다름
		arr1[0] = "python";
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}
}