package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime4566 {
	static int[] primes = null;
	static void init() {
		for (int i = 2; i < primes.length; i++) {
			primes[i] = i;
		}
		
		for (int i = 2; i < primes.length; i++) {
			if (primes[i] == 0) continue;
			for (int j = 2*i; j < primes.length; j += i) {
				primes[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine());
		int sum = 0, min = 10001;
		primes = new int[N+1];
		init();
		
		for (int i = M; i <= N; i++) {
			if (primes[i] != 0) {
				sum += i;
				min = min >= i ? i : min;
			}
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
