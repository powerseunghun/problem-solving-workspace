package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeDistinctionFunction1547 {
	static boolean f(int n) {
		int i = 0;
		
		for (i = 2; i < n; i++) {
			if (n % i == 0) break;
		}
		return i == n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (f(n)) System.out.println("prime");
		else System.out.println("composite");
	}
}
