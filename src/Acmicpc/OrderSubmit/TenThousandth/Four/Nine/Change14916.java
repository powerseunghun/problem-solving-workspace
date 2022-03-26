package Acmicpc.OrderSubmit.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Change14916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[2] = 1;
		dp[4] = 2;
		dp[5] = 1;
		
		for (int i = 6; i <= N; i++) {
			if (dp[i-2] != Integer.MAX_VALUE) {
				dp[i] = Math.min(dp[i-2]+1, dp[i]);
			}
			if (dp[i-5] != Integer.MAX_VALUE) {
				dp[i] = Math.min(dp[i-5]+1, dp[i]);
			}
		}
		
		System.out.println(dp[N] == Integer.MAX_VALUE ? -1 : dp[N]);
		br.close();
	}
}
