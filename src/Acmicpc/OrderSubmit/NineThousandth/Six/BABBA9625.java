package Acmicpc.OrderSubmit.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BABBA9625 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[] dp = new int[K+1];
		Arrays.fill(dp, 1);
		dp[0] = 0;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		System.out.println(dp[K-1] + " " + dp[K]);
		br.close();
	}
}
