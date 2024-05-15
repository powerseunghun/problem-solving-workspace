package Acmicpc.As.B4.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StickyKeys31656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) continue;
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
		br.close();
	}
}
