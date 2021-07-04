package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence4652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n], dp = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			if (arr[i] >= arr[i-1]) {
				dp[i] = dp[i-1]+1;
				max = Math.max(dp[i], max);
			}
		}
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			if (arr[i] <= arr[i-1]) {
				dp[i] = dp[i-1]+1;
				max = Math.max(dp[i], max);
			}
		}
		System.out.println(max);
	}
}
