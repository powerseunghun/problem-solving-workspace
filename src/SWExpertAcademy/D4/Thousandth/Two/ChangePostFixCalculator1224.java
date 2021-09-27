package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ChangePostFixCalculator1224 {
	static long calc(String str) {
		int a = 0, b = 0;
		char c = ' ';
		st.clear();
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				st.push(c+"");
			}
			else {
				a = Integer.parseInt(st.pop());
				b = Integer.parseInt(st.pop());
				switch(c) {
				case '+':
					st.push((a+b)+"");
					break;
				case '*':
					st.push((a*b)+"");
					break;
				}
			}
		}
		return Integer.parseInt(st.pop());
	}
	static String toPostFix(String str) {
		String postFix = "";
		char c = ' ';
		st.clear();
		for (int j = 0; j < str.length(); j++) {
			c = str.charAt(j);
			if (c >= '0' && c <= '9') {
				postFix += c;
			}
			else if (c == '+' || c == '*') {
				if (st.isEmpty()) st.push(c+"");
				else {
					while (!st.isEmpty() && priority.get(st.peek().charAt(0)) >= priority.get(c)) {
						postFix += st.pop();
					}
					st.push(c+"");
				}
			}
			else if (c == '(') {
				st.push(c+"");
			}
			else if (c == ')') {
				while (!st.peek().equals("(")) {
					postFix += st.pop();
				}
				st.pop();
			}
		}
		while (!st.isEmpty()) {
			postFix += st.pop();
		}
		return postFix;
	}
	static void mapInit() {
		priority.put('(', 1);
		priority.put('+', 2);
		priority.put('-', 2);
		priority.put('*', 3);
		priority.put(')', 1);
	}
	static Stack<String> st = new Stack<>();
	static Map<Character, Integer> priority = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		mapInit();
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			tmp = br.readLine();
			sb.append("#" + i + " " + calc(toPostFix(tmp)) + "\n");
		}
		System.out.print(sb.toString());
	}
}
