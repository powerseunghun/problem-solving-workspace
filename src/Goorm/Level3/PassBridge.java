package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassBridge {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1], dp = new int[N+1];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		dp[1] = arr[1];
		dp[2] = arr[2];
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = Math.min(Math.min(dp[i-3]+arr[i], dp[i-2]+arr[i]), dp[i-1]+arr[i]);
		}
		
		System.out.println(dp[N]);
	}
}
