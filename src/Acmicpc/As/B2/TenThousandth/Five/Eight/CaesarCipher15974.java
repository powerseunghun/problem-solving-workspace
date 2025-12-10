package Acmicpc.As.B2.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher15974 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine().split(" ")[0]);
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				sb.append((char)((c -'a' + k) % 26 + 'a')); 
			} else if (c >= 'A' && c <= 'Z') {
				sb.append((char)((c -'A' + k) % 26 + 'A')); 
			} else {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
