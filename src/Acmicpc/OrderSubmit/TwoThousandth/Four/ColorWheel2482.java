package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ColorWheel2482 {
	static int[][] dp = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		dp = new int[N+1][N+1];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = i;
			dp[i][0] = 1;
		}
		for (int i = 3; i < dp.length; i++) {
			for (int j = 2; j <= (i+1) / 2; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i-2][j-1]) % 1000000003;
			}
		}
		
		System.out.println((dp[N-3][K-1] + dp[N-1][K]) % 1000000003);
		br.close();
//		for (int i = 1; i < dp.length; i++) {
//			for (int j = 1; j < dp[i].length; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
