package Acmicpc.As.B2.TwentyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMUPC21734 {
	static int func(char c) {
		int res = 0;
		while (c != 0) {
			res += c % 10;
			c /= 10;
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < func(str.charAt(i)); j++) {
				sb.append(str.charAt(i));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
