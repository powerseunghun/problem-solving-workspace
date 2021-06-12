package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectParenthesis3715 {
	static int[] dp = null;
	static int getCount(int n) {
		if (dp[n] != 0) {
			return dp[n];
		}
		
		if (n <= 1) {
			return dp[n] = 1;
		}
		else return dp[n] = (int) ((2 * (2 * (n - 1) + 1) / (double)(n + 1)) * getCount(n-1));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		System.out.println(getCount(n));
	}
}
