package codetest.programmers;

public class Solution120911 {
	public String solution(String my_string) {

		// 소문자로 바꾸기
		String lower = my_string.toLowerCase();

		// 배열로 쪼개기
		String[] chars = lower.split("");

		// 정렬
		java.util.Arrays.sort(chars);

		String answer = "";

		// 연결
		for (String c : chars) {
			answer += c;
		}

		return answer;
	}
}
