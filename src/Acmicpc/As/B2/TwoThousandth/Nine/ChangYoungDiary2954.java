package Acmicpc.As.B2.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangYoungDiary2954 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char c = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			sb.append(c);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				i+=2;
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
