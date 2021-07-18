package Acmicpc.Step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin2293 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), k = Integer.parseInt(tmp.split(" ")[1]);;
		int[] arr = new int[n], dp = new int[k+1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < dp.length; j++) {
				// bigger arr[i]. j set
				dp[j] = dp[j] + dp[j-arr[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
