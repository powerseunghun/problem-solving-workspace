package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisValue2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		char c = ' ';
		int res = 0, tmp = 1;
		map.put(')', '(');
		map.put(']', '[');
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			switch(c) {
			case '(':
				st.push(c);
				tmp *= 2;
				break;
			case '[':
				st.push(c);
				tmp *= 3;
				break;
			default:
				if (st.isEmpty() || st.peek() != map.get(c)) {
					System.out.println("0");
					return;
				}
				else if (str.charAt(i-1) == map.get(c)) {
					res += tmp;
				}
				st.pop();
				tmp /= c == ')' ? 2 : 3;
				break;
			}
		}
		if (!st.isEmpty()) System.out.println("0");
		else System.out.println(res);
		br.close();
	}
}
