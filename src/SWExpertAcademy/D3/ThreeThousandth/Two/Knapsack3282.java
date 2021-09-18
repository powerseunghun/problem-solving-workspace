package SWExpertAcademy.D3.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knapsack3282 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[][] arr = null;
		int[] dp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N+1][2];
			dp = new int[K+1];
			for (int j = 1; j < arr.length; j++) {
				tmp = br.readLine();
				arr[j][0] = Integer.parseInt(tmp.split(" ")[0]);
				arr[j][1] = Integer.parseInt(tmp.split(" ")[1]);
			}
			for (int j = 1; j <= N; j++) {
				for (int k = K; k >= 1; k--) {
					if (arr[j][0] <= k) {
						dp[k] = Math.max(dp[k], dp[k-arr[j][0]] + arr[j][1]);
					}
				}
			}
			sb.append("#" + i + " " + dp[K] + "\n");
		}
		System.out.print(sb.toString());
	}
}
