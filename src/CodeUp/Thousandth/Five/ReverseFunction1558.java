package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseFunction1558 {
	static String f(long n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n%10);
			n /= 10;
		}
		
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Long.parseLong(br.readLine())));
	}
}
