package Acmicpc.As.B2.SevenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String7120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char cur = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			if (cur == ' ' || (cur != str.charAt(i))) {
				sb.append(str.charAt(i));
				cur = str.charAt(i);
				continue;
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
