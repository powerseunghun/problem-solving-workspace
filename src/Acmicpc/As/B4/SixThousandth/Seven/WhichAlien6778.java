package Acmicpc.As.B4.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhichAlien6778 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		if (a >= 3 && e <= 4) {
			sb.append("TroyMartian\n");
		}
		if (a <= 6 && e >= 2) {
			sb.append("VladSaturnian\n");
		}
		if (a <= 2 && e <= 3) {
			sb.append("GraemeMercurian\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
