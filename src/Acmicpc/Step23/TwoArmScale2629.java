package Acmicpc.Step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoArmScale2629 {
	static int[] arr = null;
	static boolean[][] dp = new boolean[31][15001];
	static void check(int i, int w, int n) {
		if (dp[i][w]) return;
		dp[i][w] = true;
		if (i == n) return;
		
		check(i+1, w+arr[i+1], n);
		check(i+1, Math.abs(w-arr[i+1]), n);
		check(i+1, w, n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), m = 0;
		arr = new int[n+1];
		dp = new boolean[31][15001];
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], false);
		}
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		check(0, 0, n);
		
		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0, val = 0; i < m; i++) {
			val = Integer.parseInt(st.nextToken());
			if (val > 15000) System.out.print("N ");
			else {
				if (dp[n][val]) {
					System.out.print("Y ");
				}
				else {
					System.out.print("N ");
				}
			}
		}
	}
}
