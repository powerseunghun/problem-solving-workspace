package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DivideAndConquerSum {
	static int sum(int N) {
		if (N == 1) return 1;
		
		if (N%2 != 0) return sum(N-1) + N;
		int halfN = N/2;
		return (int)(2 * sum(halfN) + Math.pow(halfN, 2));
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(sum(N));
	}
}
