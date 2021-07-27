package Acmicpc.String.ThreeThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class GoodWord3986 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		String tmp = null;
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			st.clear();
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				if (!st.isEmpty() && st.peek() == tmp.charAt(j)) {
					st.pop();
				}
				else st.push(tmp.charAt(j));
			}
			if (st.isEmpty()) count++;
		}
		System.out.println(count);
	}
}
