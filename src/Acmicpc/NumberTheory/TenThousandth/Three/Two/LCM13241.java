package Acmicpc.NumberTheory.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM13241 {
	static long GCD(long a, long b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println((A*B) / GCD(A,B));
	}
}
