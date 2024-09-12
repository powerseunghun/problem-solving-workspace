package Acmicpc.As.B3.TwentyThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Сменастиля28637 {
	static String func(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				sb.append(i != 0 ? "_" : "").append((char)(c+32));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
