package Acmicpc.BruteForceAlgorithm.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubarray10211 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0;
		int[] arr = null, dp = null;
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			max = Integer.MIN_VALUE;
			arr = new int[N];
			dp = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			dp[0] = arr[0];
			max = dp[0];
			
			for (int j = 1; j < dp.length; j++) {
				dp[j] = Math.max(dp[j-1]+arr[j], arr[j]);
				max = Math.max(max, dp[j]);
			}
			sb.append(max + "\n");
		}
		System.out.print(sb.toString());
	}
}
