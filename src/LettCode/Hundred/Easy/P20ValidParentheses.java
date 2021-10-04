package LettCode.Hundred.Easy;

import java.util.Stack;

public class P20ValidParentheses {
	static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
        	c = s.charAt(i);
        	if (c == '(' || c == '{' || c == '[') {
        		st.push(c);
        	}
        	else {
        		switch(c) {
        		case ')':
        			if (!st.isEmpty() && st.peek() == '(') {
        				st.pop();
        			}
        			else return false;
        			break;
        		case '}':
        			if (!st.isEmpty() && st.peek() == '{') {
        				st.pop();
        			}
        			else return false;
        			break;
        		case ']':
        			if (!st.isEmpty() && st.peek() == '[') {
        				st.pop();
        			}
        			else return false;
        			break;
        		}
        	}
        }
        if (st.size() == 0) return true;
        else return false;
    }
	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
	}
}
