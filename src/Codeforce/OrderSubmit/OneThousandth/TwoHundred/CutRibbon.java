package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CutRibbon {
	static int[] arr = new int[3], dp = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp[i+1]);
		}
		dp = new int[n+1];
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % arr[j] == 0) {
					dp[i] = Math.max(dp[i], i/arr[j]);
					continue;
				}
				if (dp[i] > 0 && i + arr[j] <= n) {
					dp[i+arr[j]] = Math.max(dp[i+arr[j]], dp[i]+1);
				}
			}
		}
		
		System.out.println(dp[n]);
		br.close();
	}
}
