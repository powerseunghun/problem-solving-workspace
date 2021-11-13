package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParenthesesCheck {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		char c = ' ';
		boolean flag = false;
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') st.push(c);
			else {
				if (st.isEmpty()) {
					System.out.println("False");
					return;
				}
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
				if (!flag) {
					System.out.println("False");
					return;
				}
			}
		}
		if (!st.isEmpty()) {
			System.out.println("False");
			return;
		}
		
		System.out.println("True");
		br.close();
	}
}
