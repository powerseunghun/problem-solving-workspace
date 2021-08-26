package Acmicpc.NumberTheory.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM5347 {
	static long GCD(long a, long b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		long a = 0, b = 0;
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			a = Long.parseLong(tmp.split(" ")[0]);
			b = Long.parseLong(tmp.split(" ")[1]);
			sb.append((a * b) / (GCD(a, b)) + "\n");
		}
		System.out.print(sb.toString());
	}
}
