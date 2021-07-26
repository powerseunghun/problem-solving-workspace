package Acmicpc.String.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROTThirteen11655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0, v = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				v = s.charAt(i) + 13;
				if (v > 122) v -= 26;
				sb.append((char)v);
			}
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				v = s.charAt(i) + 13;
				if (v > 90) v -= 26;
				sb.append((char)v);
			}
			else sb.append(s.charAt(i));
			
		}
		System.out.println(sb.toString());
	}
}
