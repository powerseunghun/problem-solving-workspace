package Acmicpc.As.B2.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFair15701 {
	static boolean check(int i, int N) {
		double d = (double) N/i;
		return d == i;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1 ; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				res += check(i, N) ? 1 : 2;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
