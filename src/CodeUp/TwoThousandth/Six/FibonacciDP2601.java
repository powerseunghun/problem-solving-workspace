package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FibonacciDP2601 {
	static int[] f = null;
	static boolean[] check = null;
	static int fibo(int n) {
		if (n == 1 || n == 2) {
			check[n] = true;
			f[n] = 1;
			return f[n];
		}
		if (check[n]) {
			return f[n];
		}
		else {
			check[n] = true;
			f[n] = fibo(n-2) + fibo(n-1);
			return f[n];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		f = new int[n+1];
		check = new boolean[n+1];
		Arrays.fill(f, 0);
		Arrays.fill(check, false);
		
		System.out.println(fibo(n));
	}
}
