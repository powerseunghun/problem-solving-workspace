package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompleteNumber {
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
		return sum-N;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = A; i <= B; i++) {
			if (i == getDivisorSum(i)) sb.append(i + " ");
		}
		
		System.out.print(sb.toString());
	}
}
