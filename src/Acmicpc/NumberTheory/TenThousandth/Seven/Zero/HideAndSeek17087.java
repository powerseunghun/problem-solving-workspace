package Acmicpc.NumberTheory.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HideAndSeek17087 {
	static int GCD(int a, int b) {
		if (b % a == 0)return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int diffGCD = 0, val = 0;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);

		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			diffGCD = GCD(Math.abs(val - S), diffGCD);
		}
		System.out.println(diffGCD);
	}
}
