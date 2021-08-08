package Acmicpc.BruteForceAlgorithm.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDivisor2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		int[] divisor = new int[N+1];
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) divisor[i] = 1;
		}
		
		for (int i = 1, count = 0; i <= N; i++) {
			if (divisor[i] != 0) {
				count++;
				if (count == K) {
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println("0");
	}
}
