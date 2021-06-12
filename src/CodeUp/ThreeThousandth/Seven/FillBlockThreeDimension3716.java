package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillBlockThreeDimension3716 {
	static int[] dp = null;
	static int getFill(int n) {
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n <= 3) {
			switch(n) {
			case 0:
				return dp[n] = 0;
			case 1:
				return dp[n] = 1;
			case 2:
				return dp[n] = 2;
			case 3:
				return dp[n] = 6;
			}
		}
		else return dp[n] = (getFill(n-3) * 3 + getFill(n-2) + getFill(n-1)) % 1000;
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		System.out.println(getFill(n));
	}
}
