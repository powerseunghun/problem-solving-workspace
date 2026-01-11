package Acmicpc.As.B4.ThirtyThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2025N35097 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		long res = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			res = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					res += i*j;
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
