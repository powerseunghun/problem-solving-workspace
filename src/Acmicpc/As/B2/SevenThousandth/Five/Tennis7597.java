package Acmicpc.As.B2.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tennis7597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			int A = 0, B = 0, x = 0, y = 0; 
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == 'A') {
					x++;
				} else {
					y++;
				}
				if (x >= 4 && x-y >= 2) {
					A++;
					x = 0;
					y = 0;
				} else if (y >= 4 && y-x >= 2) {
					B++;
					x = 0;
					y = 0;
				}
			}
			sb.append("A ").append(A).append(" B ").append(B).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
