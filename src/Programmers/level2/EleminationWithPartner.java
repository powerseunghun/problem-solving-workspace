package Programmers.level2;

import java.util.Stack;

public class EleminationWithPartner {
	static int solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
        	if (st.isEmpty()) {
        		st.push(s.charAt(i));
        		continue;
        	}
        	
        	if (st.peek() == s.charAt(i)) st.pop();
        	else st.push(s.charAt(i));
        }
        
        return st.isEmpty() ? 1 : 0;
    }
	public static void main(String[] args) {
		System.out.println(solution("cdcd"));
	}
}
