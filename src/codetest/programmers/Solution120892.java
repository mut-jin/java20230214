package codetest.programmers;

public class Solution120892 {
	public String solution(String cipher, int code) {
		String answer = "";
		
		for (int i = 0; i <= cipher.length(); i += code) {
			answer += cipher.charAt(i-1);
		}
		
		return answer;
	}
}
