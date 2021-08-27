package Acmicpc.NumberTheory.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthPrime15965 {
	static void primeInit(int[] prime) {
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
		int K = Integer.parseInt(br.readLine()), count = 0;
		int[] prime = new int[7368787+1];
		primeInit(prime);
		
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] != 0) {
				count++;
				if (count == K) {
					System.out.println(prime[i]);
					return;
				}
			}
		}
	}
}
