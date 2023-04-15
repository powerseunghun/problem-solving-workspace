package Acmicpc.As.B2.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VigenèreCipher5222 {
	static String func(String enc, String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, w = 0; i < str.length(); i++) {
			w = str.charAt(i) + (enc.charAt(i%enc.length())-65);
			w = w > 90 ? w-26 : w;
			sb.append((char)w);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null, enc = null, str = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			enc = tmp.split(" ")[0];
			str = tmp.split(" ")[1];
			sb.append("Ciphertext: ").append(func(enc, str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
