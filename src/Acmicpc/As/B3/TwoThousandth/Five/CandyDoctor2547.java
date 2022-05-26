package Acmicpc.As.B3.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CandyDoctor2547 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger candy = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			br.readLine();
			N = Integer.parseInt(br.readLine());
			candy = new BigInteger("0");
			for (int i = 0; i < N; i++) {
				candy = candy.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
			}
			sb.append(candy.remainder(BigInteger.valueOf(N)) == BigInteger.ZERO ? "YES" : "NO");
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
