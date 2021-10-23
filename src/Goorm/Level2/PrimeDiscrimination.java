package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeDiscrimination {
	static int[] prime = null;
	static void init() {
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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		prime = new int[A+1];
		
		init();
		System.out.println(prime[A] == 0 ? "False" : "True");
	}
}
