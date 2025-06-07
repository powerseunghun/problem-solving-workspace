package Acmicpc.As.B2.TenThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lodê10312 {
	static final int w = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), sb2 = null;
		int N = Integer.parseInt(br.readLine()), K = 0;
		
		while(N-- > 0) {
			K = Integer.parseInt(br.readLine());
			sb2 = new StringBuilder();
			
			while(K != 0) {
				sb2.append(K%w);
				K /= w;
			}
			sb2.reverse();
			for (int i = 0; i < sb2.length(); i++) {
				sb.append(sb2.charAt(i)).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
