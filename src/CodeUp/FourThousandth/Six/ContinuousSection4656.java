package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousSection4656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int[] dp = new int[8];
		int max = 0;
		
		for (int i = 0; i < 3; i++) {
			str = br.readLine();
			max = 1;
			Arrays.fill(dp, 0);
			dp[0] = 1;
			for (int j = 1; j < str.length(); j++) {
				dp[j] = 1;
				if (str.charAt(j) == str.charAt(j-1)) {
					dp[j] = dp[j-1]+1;
					max = Math.max(dp[j], max);
				}
			}
			System.out.println(max);
		}
	}
}
