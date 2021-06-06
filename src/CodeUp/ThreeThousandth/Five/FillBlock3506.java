package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FillBlock3506 {
	static int[] dp = null;
	static int fill(int n) {
		if (n == 1) {
			return dp[1] = 1;
		}
		else if (n == 2) {
			return dp[2] = 2;
		}
		
		if (dp[n] != 0) {
			return dp[n];
		}
		else {
			return dp[n] = fill(n-2) + fill(n-1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		Arrays.fill(dp, 0);
		
		System.out.println(fill(n));
	}
}
