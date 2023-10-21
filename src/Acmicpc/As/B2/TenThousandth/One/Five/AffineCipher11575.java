package Acmicpc.As.B2.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AffineCipher11575 {
	static String func(int a, int b, String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, w  = 0; i < str.length(); i++) {
			w = (a * (str.charAt(i)-65) + b) % 26; 
			sb.append((char)(w + 65));
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			str = br.readLine();
			sb.append(func(a, b, str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
