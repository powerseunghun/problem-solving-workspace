package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillBlock3712 {
	static int[] dp = null;
	static int getFill(int n) {
		if (n <= 3) {
			if (n == 3) return dp[n] = 2;
			else return dp[n] = 0;
		}
		
		if (dp[n] != 0) {
			return dp[n];
		}
		else return dp[n] = (getFill(n-3) * 2) % 100000007;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		System.out.println(getFill(n));
	}
}
