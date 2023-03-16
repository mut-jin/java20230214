package ch15.exersice.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		Stack<String> stackS = new Stack<String>();
		Stack<String> stackT = new Stack<String>();
		
		String[] S = s.split("");
		for(int i = 0; i < s.length(); i++) {
			if(S[i].equals("#") && !stackS.isEmpty()) {
				stackS.pop();
			} else if (S[0].equals("#")) {
				continue;
			} else {
				stackS.push(S[i]);
			}
			
		}
		
		String[] T = t.split("");
		for(int i = 0; i < t.length(); i++) {
			if(T[i].equals("#") && !stackT.isEmpty()) {
				stackT.pop();
			} else if (T[0].equals("#")) {
				continue;
			} else {
				stackT.push(T[i]);
			}
		}		
		
		return stackS.equals(stackT) ? true : false;
	}
}
