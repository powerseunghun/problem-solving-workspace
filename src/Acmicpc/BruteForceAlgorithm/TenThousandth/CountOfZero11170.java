package Acmicpc.BruteForceAlgorithm.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfZero11170 {
	static int getCount(int n) {
		int count = 0;
		String str = n+"";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') count++;
		}
		return count;
	}
	static int func(int n, int m) {
		int count = 0;
		for (int i = n; i <= m; i++) {
			count += getCount(i);
		}
		return count;
 	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), n = 0, m = 0;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(func(n, m) + "\n");
		}
		System.out.print(sb.toString());
	}
}
