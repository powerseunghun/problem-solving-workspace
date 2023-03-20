package Acmicpc.As.B5.TwentyThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial27433 {
//	static long func(long N) {
//		if (N == 1) return 1;
//		else return N * func(N-1);
//	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine()), res = 1;
		
		for (int i = 2; i <= N; i++) {
			res *= i;
		}
		
		System.out.println(res);
		br.close();
	}
}
