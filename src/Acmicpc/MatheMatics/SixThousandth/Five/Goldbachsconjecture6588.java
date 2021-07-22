package Acmicpc.MatheMatics.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbachsconjecture6588 {
	static void primeListInit(int[] prime) {
		for (int i = 0; i < prime.length; i++) {
			prime[i] = i;
		}
		
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = i*2; j < prime.length; j += i) {
				prime[j] = 0;
			}
 		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] prime = new int[1000001];
		int N = 0, a = 0, b = 0;
		boolean flag = false;
		primeListInit(prime);
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			
			for (int i = 2; i <= N/2; i++) {
				if (prime[i] != 0 && prime[N-i] != 0) {
					flag = true;
					a = i;
					b = N-i;
					break;
				}
			}
			if (!flag) System.out.println("Goldbach's conjecture is wrong.");
			else System.out.println(N + " = " + a + " + " + b);
		}
	}
}
