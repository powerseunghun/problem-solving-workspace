package Acmicpc.NumberTheory.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationZeroCount2004 {
	static long getPower(long n, int num) {
		long count = 0;
		while (n >= num) {
			count += n / num;
			n /= num;
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long n = Long.parseLong(tmp.split(" ")[0]);
		long m = Long.parseLong(tmp.split(" ")[1]);
		long c5 = getPower(n, 5) - getPower(n-m, 5) - getPower(m, 5);
		long c2 = getPower(n, 2) - getPower(n-m, 2) - getPower(m, 2);
		
		System.out.println(Math.min(c5, c2));
	}
}
