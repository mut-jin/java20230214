package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = " al ad al adasdsa a     asdasdasd asdasd as:daas da";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "asdasd a   ,   asdasdsa,   asdasd  ,  adassa";
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(Arrays.toString(str4));
		
	}
}
