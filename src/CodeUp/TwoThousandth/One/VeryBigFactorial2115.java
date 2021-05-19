package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VeryBigFactorial2115 {
	static void getFactorialAndPrint(int[] factorial, int n) {
		int carry = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = factorial.length-1; j >= 0; j--) {
				factorial[j] = factorial[j] * i + carry;
				carry = factorial[j] / 10;
				factorial[j] %= 10;
			}
		}
		for (int i = 0; i < factorial.length; i++) {
			if (factorial[i] == 0) continue;
			for (int j = i; j < factorial.length; j++) {
				System.out.print(factorial[j]);
			}
			return;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] factorial = new int[1000];
		factorial[factorial.length-1] = 1;
		getFactorialAndPrint(factorial, Integer.parseInt(br.readLine()));
	}
}
