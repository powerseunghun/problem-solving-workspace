package Acmicpc.As.B2.TwentyThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MessageDecowding27058 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String decKey = br.readLine();
		String str = br.readLine();
		char c = ' ', dc = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			
			if (c == ' ') {
				sb.append(c);
				continue;
			}
			dc = decKey.charAt(c-((c >= 'a' && c <= 'z') ? 97 : 65));
			sb.append((c >= 'A' && c <= 'Z') ? (char)(dc-32) : (char)dc);
//			sb.append();
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
