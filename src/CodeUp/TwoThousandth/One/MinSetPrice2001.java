package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinSetPrice2001 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] p = new int[3], j = new int[2];
		double tp = 10000, tmp = 0;
		
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < j.length; i++) {
			j[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < p.length; i++) {
			for (int k = 0; k < j.length; k++) {
				tmp = (p[i] + j[k]) + ((p[i] + j[k]) * 0.1);
				tp = tmp <= tp ? tmp : tp;
			}
		}
		
		System.out.printf("%.1f", tp);
		
	}
}
