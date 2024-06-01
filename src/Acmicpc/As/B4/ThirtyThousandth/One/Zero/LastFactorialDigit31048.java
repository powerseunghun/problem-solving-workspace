package Acmicpc.As.B4.ThirtyThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastFactorialDigit31048 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(br.readLine()), N = 0, res = 0;
		
		while(A-- > 0) {
			res = 1;
			N = Integer.parseInt(br.readLine());
			for (int i = 1; i <= N; i++) {
				res *= i;
				res %= 10;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
