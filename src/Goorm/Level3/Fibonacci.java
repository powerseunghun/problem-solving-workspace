package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
	static long[] mem = new long[31];
	static long getFibo(int N) {
		if (N == 0) return 0;
		else if (N == 1) return 1;
		
		if (mem[N] != 0) return mem[N];
		return mem[N] = getFibo(N-2) + getFibo(N-1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 1; i <= N; i++) {
			sum += getFibo(i);
		}
		System.out.println(sum);
	}
}
