package Acmicpc.OrderSubmit.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyingCard16194 {
	static int[] dp = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp = new int[N+1];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = i; j < dp.length; j++) {
				dp[j] = Math.min(dp[j], dp[j-i]+dp[i]);
			}
		}
		
		System.out.println(dp[N]);
		br.close();
	}
}
