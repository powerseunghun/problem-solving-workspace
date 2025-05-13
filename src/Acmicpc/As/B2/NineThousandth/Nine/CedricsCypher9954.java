package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CedricsCypher9954 {
	static final int w = 26;
	static char check(char c) {
		if (c >= 'A' && c <= 'Z') return 'A';
		else if (c >= 'a' && c <= 'z') return 'a';
		else return 'X';
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int s = 0;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			s = (int)('A'-str.split("\\.")[1].charAt(0));
			str = str.split("\\.")[0];
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				char b = check(c);
				
				if (b == 'A' || b == 'a') {
					sb.append((char)((c-b+s+w)%w+b));
				} else {
					sb.append(c);
				}
			}
			sb.append(".\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
