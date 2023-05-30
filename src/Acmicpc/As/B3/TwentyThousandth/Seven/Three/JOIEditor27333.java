package Acmicpc.As.B3.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JOIEditor27333 {
	static char getUpper(char c) {
		if (c >= 'A' && c <= 'Z') return c;
		return (char)(c-32);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringBuffer sb = new StringBuffer(br.readLine());
		char c1 = ' ', c2 = ' ';
		
		for (int i = 1; i < sb.toString().length(); i++) {
			c1 = sb.toString().charAt(i-1);
			c2 = sb.toString().charAt(i);
			if (sb.toString().charAt(i) == sb.toString().charAt(i-1)) {
				// a~z skip
				sb.setCharAt(i-1, getUpper(c1));
				sb.setCharAt(i, getUpper(c2));
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
