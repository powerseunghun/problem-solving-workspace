package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SqrtImplFunction1550 {
	static int f(long n) {
		return (int)Math.sqrt(n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Long.parseLong(br.readLine())));
	}
}
