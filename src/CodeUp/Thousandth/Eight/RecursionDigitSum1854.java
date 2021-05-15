package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionDigitSum1854 {
	static long f(long n) {
		if (n <= 0) return 0;
		else return (n%10) + f(n/10);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Long.parseLong(br.readLine())));
	}
}
