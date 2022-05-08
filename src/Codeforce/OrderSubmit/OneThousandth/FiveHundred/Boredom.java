package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boredom {
	static long[] arr = new long[100001], dp = new long[100001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		dp[1] = arr[1] * 1;
		
		for (int i = 2; i <= 100000; i++) {
			dp[i] = Math.max(dp[i-2]+arr[i]*i, dp[i-1]);
		}
		
		System.out.println(dp[100000]);
		br.close();
	}
}
