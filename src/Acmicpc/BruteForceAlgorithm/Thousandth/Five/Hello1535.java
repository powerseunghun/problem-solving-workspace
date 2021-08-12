package Acmicpc.BruteForceAlgorithm.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello1535 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		int[] dp = new int[101];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < w.length; i++) {
			w[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < v.length; i++) {
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < w.length; i++) {
			for (int j = 100; j >= 1; j--) {
				if (w[i] < j) {
					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[100]);
	}
}
