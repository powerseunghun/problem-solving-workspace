package Acmicpc.OrderSubmit.TenThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourSqaures17626 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i <= N; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]);
			}
			dp[i]++;
		}
		System.out.println(dp[N]);
		br.close();
	}
}
