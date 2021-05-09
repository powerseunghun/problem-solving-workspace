package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCMFunction1565 {
	static long GCD(long a, long b) {
		if (a % b == 0) return b;
		else return GCD(b%a, a);
	}
	static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println(LCM(a, b));
	}
}
