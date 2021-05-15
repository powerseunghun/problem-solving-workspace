package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionReversePrint1919 {
	static StringBuilder sb = new StringBuilder();
	static void f(long n) {
		if (n == 0) return;
		else {
			sb.append(n%10);
			f(n/10);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		if (n == 0) System.out.println("0");
		else {
			f(n);
			System.out.println(Long.parseLong(sb.toString()));
		}
	}
}
