package Acmicpc.As.B2.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome17502 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 0, v = 0; i < str.length(); i++) {
			if (str.charAt(i) == '?') {
				v = str.length()-(i+1);
				if (i == v) {
					sb.setCharAt(i, 'a');
				}
				else {
					if (str.charAt(v) == '?') {
						sb.setCharAt(i, 'a');
						sb.setCharAt(v, 'a');
					}
					else {
						sb.setCharAt(i, str.charAt(v));
					}
				}
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}
