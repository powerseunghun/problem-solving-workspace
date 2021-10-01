package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EasyCalculator1222 {
	static Stack<String> st = new Stack<>();
	static String changePostFix(String tmp) {
		String str = "";
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') {
				str += tmp.charAt(i);
			}
			else {
				if (!st.isEmpty()) {
					str += st.pop();
				}
				st.push(tmp.charAt(i)+"");
			}
		}
		while (!st.isEmpty()) str += st.pop();
		return str;
	}
	static int calcPostFix(String str) {
		int a = 0, b = 0, sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '+') {
				a = Integer.parseInt(st.pop());
				b = Integer.parseInt(st.pop());
				st.push((a+b)+"");
			}
			else st.push(str.charAt(i)+"");
		}
		return Integer.parseInt(st.pop());
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			tmp = br.readLine();
			st.clear();
			sb.append("#" + i + " " + calcPostFix(changePostFix(tmp)) + "\n");
		}
		System.out.print(sb.toString());
	}
}
