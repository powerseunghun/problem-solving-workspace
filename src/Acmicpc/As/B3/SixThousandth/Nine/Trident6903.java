package Acmicpc.As.B3.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trident6903 {
	static final int tl = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < tl; j++) {
				sb.append("*");
				if (j == tl-1) continue;
				for (int k = 0; k < s; k++) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		for (int i = 0; i < s*2+3; i++) {
			sb.append("*");
		}
		sb.append("\n");
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < s+1; j++) {
				sb.append(" ");
			}
			sb.append("*\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
