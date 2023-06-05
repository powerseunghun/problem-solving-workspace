package Acmicpc.As.B2.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus9546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), k = 0;
		double res = 1;
		
		while(T-- > 0) {
			k = Integer.parseInt(br.readLine());
			res = 1;
			for (int i = 0; i < k-1; i++) {
				res += 0.5;
				res *= 2;
			}
			sb.append((int)res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
