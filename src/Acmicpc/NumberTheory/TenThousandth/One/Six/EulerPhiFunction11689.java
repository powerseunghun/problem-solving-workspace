package Acmicpc.NumberTheory.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EulerPhiFunction11689 {
	static long getEulerPhiFunction(long n) {
		long phi = n;
		long prime = 2;
		
		while (Math.pow(prime, 2) <= n) {
			if (n % prime == 0) phi = phi/prime*(prime-1);
			while (n % prime == 0) n /= prime;
			prime++;
		}
		return n != 1 ? phi / n*(n-1) : phi;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(getEulerPhiFunction(n));
	}
}
