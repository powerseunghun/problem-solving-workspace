package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoinCatchFestival {
	static int[] arr = null;
	static int[] dp = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		arr = new int[N];
		dp = new int[N];
		Arrays.fill(dp, 0);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				dp[i] = arr[0];
				max = Math.max(dp[i], max);
				continue;
			}
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			max = Math.max(dp[i], max);
		}

		System.out.println(max);
 	}
}
