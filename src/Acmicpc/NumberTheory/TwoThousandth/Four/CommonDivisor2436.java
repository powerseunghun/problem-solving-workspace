package Acmicpc.NumberTheory.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonDivisor2436 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = 0, d = 0;
		b /= a;
		
		for (int i = 1; i * i <= b; i++) {
			if (b % i == 0) { 
				if (GCD(i, b/i) == 1) {
					c = i;
					d = b/i;
				}
			}
		}
		System.out.println(c*a + " " + d*a);
	}
}
