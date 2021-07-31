package Acmicpc.DataStructure.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronStick10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stick = br.readLine();
		Stack<Character> st = new Stack<>();
		int piece = 0;
		
		for (int i = 0; i < stick.length(); i++) {
			char c = stick.charAt(i);
			switch(c) {
			case '(':
				st.add(c);
				break;
			case ')':
				st.pop();
				piece += stick.charAt(i-1) == '(' ? st.size() : 1;
				break;
			}
		}
		System.out.println(piece);
	}
}
