package Acmicpc.String.TenThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class WordReverse17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<>();
		String s = br.readLine();
		boolean ignore = false;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				ignore = true;
				while (!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(s.charAt(i));
			}
			else if (s.charAt(i) == '>') {
				ignore = false;
				System.out.print(s.charAt(i));
			}
			else if(ignore) {
				System.out.print(s.charAt(i));
			}
			else if(!ignore) {
				if (s.charAt(i) == ' ') {
					while(!st.isEmpty()) {
						System.out.print(st.pop());
					}
					System.out.print(" ");
				}
				else st.push(s.charAt(i));
			}
		}
		while (!st.isEmpty()) System.out.print(st.pop());
	}
}
