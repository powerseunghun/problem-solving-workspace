package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UglyNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1], preNumber = new int[3];
		int[] idxs = {1, 1, 1}, weight = {2, 3, 5};
		dp[1] = 1;
		
		for (int i = 2, min = 0; i <= N; i++) {
			for (int j = 0; j < preNumber.length; j++) {
				preNumber[j] = dp[idxs[j]] * weight[j];
			}
			min = Math.min(preNumber[0], Math.min(preNumber[1], preNumber[2]));
			
			for (int j = 0; j < preNumber.length; j++) {
				if (preNumber[j] == min) {
					idxs[j]++;
				}
			}
			dp[i] = min;
		}
		
		System.out.println(dp[N]);
		br.close();
	}
}
