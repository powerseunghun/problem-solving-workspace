package Acmicpc.As.B2.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class PasswordCheck15239 {
	static List<Character> list = Arrays.asList('+', '_', ')', '(', '*', '&',
			'^', '%', '$', '#', '@', '!', '.', '/', ',', ';', '{', '}');
	static boolean[] vs = new boolean[4];
	static boolean check(String str) {
		char c = ' ';
		
		Arrays.fill(vs, false);
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') vs[0] = true;
			if (c >= 'a' && c <= 'z') vs[1] = true;
			if (c >= '0' && c <= '9') vs[2] = true;
			if (list.contains(c)) vs[3] = true;
		}
		
		for (boolean b : vs) {
			if (!b) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), L = 0;
		String str = null;
		
		while(T-- > 0) {
			L = Integer.parseInt(br.readLine());
			str = br.readLine();
			sb.append(L < 12 ? "invalid" : check(str) ? "valid" : "invalid").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
