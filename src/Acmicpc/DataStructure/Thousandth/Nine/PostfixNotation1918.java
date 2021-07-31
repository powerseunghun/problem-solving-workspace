package Acmicpc.DataStructure.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixNotation1918 {
	static int getPriority(char c) {
		if (c == '*' || c == '/') return 2;
		else if (c == '+' || c == '-') return 1;
		else if (c == '(' || c == ')') return 0;
		else return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<>();
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int p = getPriority(c);
			
			if (c >= 'A' && c <= 'Z') {
				sb.append(c);
				continue;
			}
			switch(c) {
			case '*': case '/': case '+': case '-':
				while(!st.isEmpty() && getPriority(st.peek()) >= p) {
					sb.append(st.pop());
				}
				st.push(c);
				break;
			case '(':
				st.push(c);
				break;
			case ')':
				while (!st.isEmpty() && st.peek() != '(') {
					sb.append(st.pop());
				}
				st.pop();
				break;
			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		System.out.println(sb.toString());
	}
}
