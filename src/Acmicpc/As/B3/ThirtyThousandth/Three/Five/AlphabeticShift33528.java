package Acmicpc.As.B3.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabeticShift33528 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < str.length(); j++) {
				int v = (int)((char)(str.charAt(j)-i));
				if (v < 65) {
					v += 26;
				}
				sb.append((char)v);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
