package Acmicpc.As.B2.TenThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password18245 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int w = 2, s = 0;
		
		while (true) {
			str = br.readLine();
			if (str.equals("Was it a cat I saw?")) break;
			s = 0;
			while (s < str.length()) {
				sb.append(str.charAt(s));
				s += w;
			}
			sb.append("\n");
			w++;
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
