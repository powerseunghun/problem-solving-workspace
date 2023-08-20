package Acmicpc.As.B1.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci24416 {
	static int res1 = 0, res2 = 0;
	static int[] f = null;
	static int fib(int n) {
		if (n == 1 || n == 2) {
			res1++;
			return 1;
		}
		else return fib(n-1) + fib(n-2);
	}
	static int fibonacci(int n) {
		f[1] = 1;
		f[2] = 1;
		for (int i = 3; i <= n; i++) {
			res2++;
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		f = new int[n+1];
		
		fib(n);
		fibonacci(n);
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
