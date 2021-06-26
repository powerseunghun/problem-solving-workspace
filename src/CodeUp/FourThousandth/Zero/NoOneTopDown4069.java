package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NoOneTopDown4069 {
	static int[] dp = null;
	static int get(int n) {
		if (n == 1) return 0;
		if (dp[n] != 0) return dp[n];
		
		dp[n] = get(n-1) + 1;
		
		if (n % 5 == 0) {
			dp[n] = Math.min(dp[n], get(n/5)+1);
		}
		if (n % 2 == 0) {
			dp[n] = Math.min(dp[n], get(n/2)+1);
		}
		return dp[n];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		System.out.println(get(n));
	}
}
