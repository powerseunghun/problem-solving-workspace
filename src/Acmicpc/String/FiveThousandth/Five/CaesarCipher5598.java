package Acmicpc.String.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher5598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0, val = 0; i < str.length(); i++) {
			val = str.charAt(i) - 3;
			if (val < 65) val += 26;
			sb.append((char)val);
		}

		System.out.println(sb.toString());
	}
}
