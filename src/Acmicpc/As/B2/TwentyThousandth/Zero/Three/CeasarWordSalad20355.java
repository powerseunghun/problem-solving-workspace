package Acmicpc.As.B2.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeasarWordSalad20355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < 26; i++) {
			sb = new StringBuilder();
			for (int j = 0; j < str.length(); j++) {
				sb.append((char)('a'+(str.charAt(j)-'a'+i)%26));
			}
			if (!sb.toString().contains("i")) {
				res++;
			}
		}
		
		System.out.println(res > 0 ? res : "impossible");
		br.close();
	}
}
