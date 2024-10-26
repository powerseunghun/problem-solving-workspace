package Acmicpc.As.B4.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BarcodeNickname32288 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				sb.append((char)(c-32));
			} else sb.append((char)(c+32));
		}
		System.out.println(sb.toString());
		br.close();
	}
}
