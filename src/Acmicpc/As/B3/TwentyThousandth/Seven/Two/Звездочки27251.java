package Acmicpc.As.B3.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Звездочки27251 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= Math.min(n, 10); i++) {
			for (int j = 0; j < Math.pow(i, 2); j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 11; i <= n; i++) {
			for (int j = 0; j < Math.pow(10, 2); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
