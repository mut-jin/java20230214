package codetest.programmers;

public class Solution120891 {
	public int solution(int order) {
		int clap = 0;

		do {
			int right = order % 10;

			if (right == 3 || right == 6 || right == 9) {
				clap ++;
			}
			
//			clap += switch (right) {
//			case 3, 6, 9 -> 1;
//			default -> 0;
//			};

			order /= 10;

		} while (order != 0);

		return clap;
	}
}
