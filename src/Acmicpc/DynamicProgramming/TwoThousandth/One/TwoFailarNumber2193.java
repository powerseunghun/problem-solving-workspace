package Acmicpc.DynamicProgramming.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoFailarNumber2193 {
	static boolean[] check = null;
	static long[] arr = null;
	static long getNumber(int N) {
		if (check[N]) return arr[N];
		if (N <= 2) {
			check[N] = true;
			return arr[N] = 1;
		}
		else {
			check[N] = true;
			return arr[N] = getNumber(N-1) + getNumber(N-2);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+1];
		check = new boolean[N+1];
		
		System.out.println(getNumber(N));
	}
}
