package Acmicpc.NumberTheory.ThreeThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyDistribution3955 {
	// c*y 1(modK)
	static long EGCD(long a, long b) {
		long r = 0, q = 0, ta = a, t = 0, t1 = 0, t2 = 1;
		while (b != 0) {
			q = a/b;
			r = a%b;
			t = t1-(q*t2);
			a = b;
			b = r;
			t1 = t2;
			t2 = t;
		} 
		while (t1 < 0) t1 += ta;
		return t1;
	}
	static long GCD(long a, long b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		long K = 0, C = 0, val = 0;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			K = Long.parseLong(tmp.split(" ")[0]);
			C = Long.parseLong(tmp.split(" ")[1]);
			if (K == 1 && C == 1) sb.append("2\n");
			else if (K == 1) {
				sb.append("1\n");
			}
			else if (C == 1) {
				if (K + 1 > Math.pow(10, 9)) sb.append("IMPOSSIBLE\n");
				else sb.append((K+1) + "\n");
			}
			else if (GCD(K, C) != 1) sb.append("IMPOSSIBLE\n");
			else {
				val = EGCD(K, C);
				if (val > Math.pow(10, 9)) sb.append("IMPOSSIBLE\n");
				else sb.append(val + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}
