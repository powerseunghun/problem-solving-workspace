package Acmicpc.As.B2.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyEncryption9783 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = br.readLine();
		char c = ' ';
		
		for (int i = 0, w = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				w = c-96;
				sb.append(String.format("%02d", w));
			}
			else if (c >= 'A' && c <= 'Z') {
				w = c-38;
				sb.append(String.format("%02d", w));
			}
			else if (c >= '0' && c <= '9') {
				sb.append("#"+c);
			}
			else sb.append(c);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
