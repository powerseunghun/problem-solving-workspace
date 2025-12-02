package Acmicpc.As.B2.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumbledWords7583 {
	static String func(String t) {
		int n = t.length();
		if (n == 1) return t;
		StringBuilder sb = new StringBuilder(t);
		String s = sb.reverse().toString();
		return s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			st = new StringTokenizer(str);
			while (st.hasMoreTokens()) {
				String t = st.nextToken();
				sb.append(func(t) + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
