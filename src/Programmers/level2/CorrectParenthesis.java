package Programmers.level2;

import java.util.Stack;

public class CorrectParenthesis {
	boolean solution(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}
			else {
				// if (st.isEmpty() || st.peek() != '(') -> TLE
				// if (st.isEmpty()), if (st.peek() != '(') -> TLE
                if (st.isEmpty()) return false;
                else if (st.peek() != '(') return false;
				else st.pop();
			}
		}
		if (!st.isEmpty()) return false;
		return true;
    }
	public static void main(String[] args) {
		
	}
}
