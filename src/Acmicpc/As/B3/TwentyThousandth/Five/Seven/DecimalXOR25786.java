package Acmicpc.As.B3.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalXOR25786 {
	static String[] strs = new String[2]; 
	static void pre(StringBuilder sb, String str, int maxLength) {
		for (int i = 0; i < maxLength-str.length(); i++) {
			sb.append("0");
		}
		sb.append(str);
	}
	static String func(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		for (int i = str1.length()-1, v1 = 0, v2 = 0; i >= 0; i--) {
			v1 = str1.charAt(i)-'0';
			v2 = str2.charAt(i)-'0';
			sb.append(((v1 <= 2 && v2 <= 2) || (v1 >= 7) && (v2 >= 7)) ? "0" : "9");
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int maxLength = 0;
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
		}
		maxLength = Math.max(strs[0].length(), strs[1].length());
	
		for (int i = 0; i < strs.length; i++) {
			pre(i == 0 ? sb1 : sb2, strs[i], maxLength);
		}
		
		System.out.println(func(sb1.toString(), sb2.toString()));
		br.close();
	}
}
