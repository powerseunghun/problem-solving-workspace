package CodeUp.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceSumLarge3706 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long a = (((n-1) * n * (2*n-1)) / 6) % 100000007;
		long b = ((n * (n-1) * 3) / 2) % 100000007;
		long c = (2 * (n - 1)) % 100000007;
		
		long sum = ((a + b + c) / 2) % 100000007;
		System.out.println(n * (n-1) * 3);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a : " + c);
		System.out.println(1 + sum);
	}
}
