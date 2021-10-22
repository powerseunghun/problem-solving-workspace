package LettCode.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorSum {
	static int getDivisorSum(int N) {
		int sum = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				if (i*i == N) {
					sum += i;
				}
				else {
					sum += i;
					sum += (N / i);
				}
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
