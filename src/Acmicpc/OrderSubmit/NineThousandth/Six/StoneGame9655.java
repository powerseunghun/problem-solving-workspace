package Acmicpc.OrderSubmit.NineThousandth.Six;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StoneGame9655 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 1;
		
		for (int i = 4; i <= N; i++) {
			dp[i] = Math.min(dp[i-1]+1, dp[i-3]+1);
		}
		
		System.out.println(dp[N] % 2 == 0 ? "CY" : "SK");
		br.close();
	}
}
