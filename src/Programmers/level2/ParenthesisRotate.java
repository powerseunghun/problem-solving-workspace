package Programmers.level2;

import java.util.Stack;
public class ParenthesisRotate {
	static boolean checkParenthesis(String str) {
		Stack<Character> st = new Stack<>();
		char c = ' ';
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') st.push(c);
			else {
				if (st.isEmpty()) return false;
				flag = true;
				switch(c) {
				case ')':
					if (st.pop() != '(') flag = false;
					break;
				case '}':
					if (st.pop() != '{') flag = false;
					break;
				case ']':
					if (st.pop() != '[') flag = false;
					break;
				}
				if (!flag) return false;
			}
		}
		if (!st.isEmpty()) return false;
		return true;
	}
	static int solution(String s) {
        int answer = 0;
        String str = null;
        
        for (int i = 0; i < s.length(); i++) {
        	str = s.substring(i, s.length()) + s.substring(0, i);
        	if (checkParenthesis(str)) answer++;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String str = "[](){}";
		
		System.out.println(solution(str));
	}
}
