package codetest.programmers;

public class Solution120839 {

	public String solution(String rsp) {
		String answer = "";
		char[] array = rsp.toCharArray();

		for (char a : array) {
			char w = switch (a) {
			case '0' -> '5';
			case '2' -> '0';
			case '5' -> '2';
			default -> ' ';
			};
			answer += w;
		}

		return answer;
	}
}