package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionReverseCollatzConjecture1929 {
	static void f(int n) {
		if (n == 1) {
			System.out.println("1");
			return;
		}
		else {
			if (n % 2 == 0) f(n/2);
			else f(n * 3 + 1);
		}
		System.out.println(n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
