package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixCalculate3127 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> st = new Stack<>();
		StringTokenizer stk = new StringTokenizer(br.readLine());
		String tmp = null;
		
		while (stk.hasMoreTokens()) {
			tmp = stk.nextToken();
			if (tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/")) {
				if (!st.isEmpty()) {
					int val1 = Integer.parseInt(st.pop());
					int val2 = Integer.parseInt(st.pop());
					switch(tmp) {
					case "+":
						st.add((val2 + val1) + "");
						break;
					case "-":
						st.add((val2 - val1) + "");
						break;
					case "*":
						st.add((val2 * val1) + "");
						break;
					case "/":
						st.add((val2 / val1) + "");
						break;
					}
				}
			}
			else st.add(tmp);
		}
		System.out.println(st.pop());
	}
}
