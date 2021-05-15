package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RecursionLargeFibo1916 {
	static int[] check = null;
	static long[] fibo = null;
	static long f(int n) {
		if (check[n] == 1) return fibo[n];
		check[n] = 1;
		if (n <= 2) {
			fibo[n] = 1;
			return fibo[n];
		}
		else {
			fibo[n] = (f(n-2) + f(n-1)) % 10009;
			return fibo[n];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		check = new int[n+1];
		fibo = new long[n+1];
		Arrays.fill(check, 0);
		Arrays.fill(fibo, 0);
		
		System.out.println(f(n));
	}
}
