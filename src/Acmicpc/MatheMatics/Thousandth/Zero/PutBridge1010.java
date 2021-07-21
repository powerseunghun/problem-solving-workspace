package Acmicpc.MatheMatics.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PutBridge1010 {
	static int[][] mem = new int[30][30];
	static int comb(int n, int r) {
		int ans = 1;
		for (int i = 1; i <= r; i++) {
			ans = ans * (n-i+1)/i;
		}
		
		return ans;
//		if (mem[n][r] > 0) return mem[n][r];
//		
//		if (n == r || r == 0) {
//			mem[n][r] = 1;
//			return mem[n][r];
//		}
//		
//		return comb(n-1, r-1) + comb(n-1, r);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0, n = 0, r = 0; i < T; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			r = Integer.parseInt(tmp.split(" ")[1]);
//			System.out.println(comb(r, n));
			sb.append(comb(r, n) + "\n");
		}
		System.out.print(sb.toString());
	}
}
