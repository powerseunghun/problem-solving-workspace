package Acmicpc.As.B2.SevenThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial7489 {
	static long func(int N) {
		long res = 1;
		for (int i = 2; i <= N; i++) {
			res *= i;
			while (res % 10 == 0) {
				res /= 10;
			}
			res %= 10000000000L;
		}
		return res % 10;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), N = 0;
		
		while(t-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(func(N)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
