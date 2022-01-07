package Programmers.level3;

import java.util.Stack;

public class MoveHundredTen {
	static int count = 0;
	static void inputStack(Stack<Character> st, String str) {
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (st.size() >= 2) {
				char c1 = st.pop(); // 0
				char c2 = st.pop(); // 1
				if (c1 == '1' && c2 == '1' && str.charAt(i) == '0') {
					count++;
				}
				else {
					st.push(c2);
					st.push(c1);
					st.push(str.charAt(i));
				}
			}
			else st.push(str.charAt(i));
		}
	}
	static String getString(Stack<Character> st) {
		int idx = st.size();
		StringBuilder sb = new StringBuilder();
		boolean check = false;
		char val = ' ';
		
		while (!st.isEmpty()) {
			val = st.pop();
			if (!check) {
				if (val == '1') idx--;
				else check = true;
			}
			sb.insert(0, val);
		}
		
		for (int i = 0; i < count; i++) {
			sb.insert(idx, "110");
			idx += 3;
		}
		return sb.toString();
	}
	static String[] solution(String[] s) {
        String[] answer = new String[s.length];
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length; i++) {
        	st.clear();
        	inputStack(st, s[i]);
        	answer[i] = getString(st);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] s = {"1110", "100111100", "0111111010"};
		String[] ans = solution(s);
		
		for (String str : ans) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
