package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialReturnFunction1556 {
	static long f(int n) {
		long fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine())));
	}
}
