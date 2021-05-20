package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeSum2624 {
	static void init(int[] prime) {
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			else {
				for (int j = i+i; j < prime.length; j+= i) {
					prime[j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		int[] prime = new int[n+1];
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		init(prime);
		for (int i = 2; i <= n; i++) {
			if (prime[i] != 0) sum += i;
		}
		
		System.out.println(sum);
	}
}
