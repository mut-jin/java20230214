package codetest.programmers;

public class Solution120841 {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        // 코드 작성
        
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
        
    }
}
