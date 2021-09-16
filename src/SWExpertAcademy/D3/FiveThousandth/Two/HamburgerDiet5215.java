package SWExpertAcademy.D3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburgerDiet5215 {
	//knapsack
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[][] arr = null, dp = null;;
		int T = Integer.parseInt(br.readLine()), N = 0, L = 0, max = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			max = Integer.MIN_VALUE;
			N = Integer.parseInt(tmp.split(" ")[0]);
			L = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N+1][2];
			dp = new int[N+1][L+1];
			for (int j = 1; j <= N; j++) {
				tmp = br.readLine();
				arr[j][0] = Integer.parseInt(tmp.split(" ")[0]);
				arr[j][1] = Integer.parseInt(tmp.split(" ")[1]);
			}
			for (int j = 1; j < arr.length; j++) {
				for (int k = 1; k <= L; k++) {
					if (arr[j][1] > k) dp[j][k] = dp[j-1][k];
					else dp[j][k] = Math.max(arr[j][0] + dp[j-1][k-arr[j][1]], dp[j-1][k]);
				}
			}
			sb.append("#" + i + " " + dp[N][L] + "\n");
		}
		System.out.print(sb.toString());
	}
}
