package Acmicpc.String.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxAbbreviation14490 {
	static int GCD(int n, int m) {
		if (m == 0) return n;
		else return GCD(m, n%m);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int div = GCD(n, m);
		
		System.out.println((n/div) + ":" + (m/div));
	}
}
