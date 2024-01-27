package Acmicpc.As.B5.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial27434 {
	static BigInteger func(int n, int fact) {
		BigInteger b = new BigInteger(String.valueOf(n));
		if (fact > n) {
			b = func(n, (n+fact)/2).multiply(func(((n+fact)/2)+1, fact));
		}
		return b;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fact = Integer.parseInt(br.readLine());
		
		System.out.println(func(1, fact));
		br.close();
	}
}
