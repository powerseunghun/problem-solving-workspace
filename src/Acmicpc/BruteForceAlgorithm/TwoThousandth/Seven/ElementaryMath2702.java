package Acmicpc.BruteForceAlgorithm.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementaryMath2702 {
	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a%b);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		
		for (int i = 0, gcd = 0; i < T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			gcd = GCD(a, b);
			sb.append((a * b)/gcd + " " + gcd + "\n");
		}
		System.out.println(sb.toString());
	}
}
