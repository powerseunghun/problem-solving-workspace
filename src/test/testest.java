package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= N; i++) {
			System.out.println("E");
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
		}
		
		for (int el : dp) {
			System.out.print(el + " ");
		}
	}
}
