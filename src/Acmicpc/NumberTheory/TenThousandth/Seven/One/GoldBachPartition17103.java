package Acmicpc.NumberTheory.TenThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBachPartition17103 {
	static void primeInit(int[] prime) {
		// sieve
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = 2 * i; j < prime.length; j+= i) {
				prime[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] prime = new int[1000001];
		primeInit(prime);
		
		int T = Integer.parseInt(br.readLine()), N = 0, count = 0;
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			count = 0;
			for (int j = 2; j <= N/2; j++) {
				if (prime[j] != 0 && prime[N-j] != 0) {
					count++;
				}
			}
			sb.append(count + "\n");
		}
		System.out.print(sb.toString());
	}
}
