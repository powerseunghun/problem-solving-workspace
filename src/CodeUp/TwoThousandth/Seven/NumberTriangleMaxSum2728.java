package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberTriangleMaxSum2728 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[][] dp = new int[N+1][N+1];
		
		for (int i = 1; i < dp.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
				if (j == 1) {
					dp[i][j] += dp[i-1][j];
				}
				else if (j == i) {
					dp[i][j] += dp[i-1][j-1];
				}
				else {
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
				}
				max = dp[i][j] >= max ? dp[i][j] : max;
			}
		}
		
		System.out.println(max);
	}
}
