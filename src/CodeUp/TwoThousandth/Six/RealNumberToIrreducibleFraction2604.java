package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealNumberToIrreducibleFraction2604 {
	static int GCD(int a, int b) {
		if (b%a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int denominator = (int) Math.pow(10, tmp.split("\\.")[1].length());
		int numerator = (int)Math.ceil((Double.parseDouble(tmp) * denominator));
		int div = GCD(denominator, numerator);
		
		System.out.println(numerator / div + " " + denominator / div);
		
	}
}
