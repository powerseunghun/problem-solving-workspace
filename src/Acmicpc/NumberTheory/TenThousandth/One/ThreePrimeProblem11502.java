package Acmicpc.NumberTheory.TenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreePrimeProblem11502 {
	static int[] prime = new int[1001];
	static void primeInit() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = 2*i; j < prime.length; j+=i) {
				prime[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), K = 0, ln = 0;
		
		primeInit();
		for (int i = 0; i < T; i++) {
			K = Integer.parseInt(br.readLine());
			for (int j = 2; j <= K/2; j++) {
				for (int k = 2; k <= K/2; k++) {
					ln = K - (j+k);
					if (ln != 0 && prime[j] != 0 && prime[k] != 0 && prime[ln] != 0) {
						sb.append(j + " " + k + " " + ln + "\n");
						k = K/2+1;
						j = K/2+1;
						break;
					}
				}
			}
		}
		System.out.print(sb.toString());
	}
}
