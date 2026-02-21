package Acmicpc.As.B2.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordMix26590 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String a = str.split(" ")[0], b = str.split(" ")[1];
		
		for (int i = 0; i<a.length() && i<b.length(); i++) {
			sb.append((i&1) != 0 ? b.charAt(i) : a.charAt(i));
		}
		System.out.print(sb.toString());
		br.close();
	}
}
