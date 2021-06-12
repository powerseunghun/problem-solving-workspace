package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FillBlock3713 {
	static int[] dp = null;
	static int getFill(int n) {
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n <= 1) {
			return dp[n] = 1;
		}
		else {
			return dp[n] = (getFill(n-2) * 2 + getFill(n-1)) % 100007;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		Arrays.fill(dp, 0);
		dp[0] = 1; dp[1] = 1;
		
		System.out.println(getFill(n));
 	}
}
