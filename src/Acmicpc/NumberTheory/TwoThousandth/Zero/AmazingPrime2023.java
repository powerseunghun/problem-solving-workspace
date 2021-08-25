package Acmicpc.NumberTheory.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmazingPrime2023 {
	static StringBuilder sb = new StringBuilder();
	static void search(int num, int d) {
		if (d == 0) sb.append(num+"\n");
		// even
		for (int i = 1, n = 0; i <= 9; i += 2) {
			n = num*10+i;
			if (primeCheck(n)) search(n, d-1);
		}
	}
	static boolean primeCheck(int n) {
		if (n < 2) return false;
		for (int i = 2; i*i <=n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		search(2, N-1);
		search(3, N-1);
		search(5, N-1);
		search(7, N-1);
		System.out.print(sb.toString()); 
	}
}
