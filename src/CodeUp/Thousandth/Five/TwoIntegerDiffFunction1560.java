package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoIntegerDiffFunction1560 {
	static long f(long a, long b) {
		return Math.abs((long)a-b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		System.out.println(f(a, b));
	}
}
