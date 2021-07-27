package Acmicpc.String.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noise2935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		char oper = br.readLine().charAt(0);
		String s2 = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		switch(oper) {
		case '*':
			for (int i = 0; i < s1.length()-1; i++) {
				s2 += "0";
			}
			sb.append(s2);
			break;
		case '+':
			if (s1.length() > s2.length()) {
				for (int i = 0; i < s1.length()-s2.length(); i++) {
					sb.append(s1.charAt(i));
				}
				for (int i = 0; i < s2.length(); i++) {
					sb.append(s2.charAt(i));
				}
			}
			else if (s2.length() > s1.length()) {
				for (int i = 0; i < s2.length()-s1.length(); i++) {
					sb.append(s2.charAt(i));
				}
				for (int i = 0; i < s1.length(); i++) {
					sb.append(s1.charAt(i));
				}
			}
			else {
				sb.append("2");
				for (int i = 0; i < s1.length()-1; i++) {
					sb.append("0");
				}
			}
			break;
		}
		System.out.println(sb.toString());
		
	}
}
