package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectParentheses3129 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		char c = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			switch(c) {
			case '(':
				st.add(str.charAt(i));
				break;
			case ')':
				if (st.isEmpty()) {
					System.out.println("bad");
					return;
				}
				else st.pop();
			}
		}
		if (st.isEmpty()) System.out.println("good");
		else System.out.println("bad");
	}
}
