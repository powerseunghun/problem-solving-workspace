package Acmicpc.MatheMatics.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumber2747 {
	static int[] arr = null;
	static boolean[] mem = null;
	static int fibo(int N) {
		if (mem[N]) {
			return arr[N];
		}
		if (N < 2) {
			mem[N] = true;
			return arr[N] = N;
		}
		else {
			mem[N] = true;
			return arr[N] = fibo(N-2) + fibo(N-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		mem = new boolean[N+1];
		
		System.out.println(fibo(N));
	}
}
