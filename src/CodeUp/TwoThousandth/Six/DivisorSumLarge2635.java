package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorSumLarge2635 {
	static long getDivisorSum(int N) {
		long sum = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				sum = Math.sqrt(N) == i ? sum + i : sum + i + (N / i);
			}
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getDivisorSum(N));
	}
}
