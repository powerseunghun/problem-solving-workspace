package Acmicpc.OrderSubmit.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSum13398 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], dp = new int[N], dp2 = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
        max = Math.max(max, dp[0]);
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		
		dp2[N-1] = arr[N-1];
		
		for (int i = N-2; i >= 0; i--) {
			dp2[i] = Math.max(dp2[i+1] + arr[i], arr[i]);
		}
		
		for (int i = 1; i < N-1; i++) {
			max = Math.max(dp[i-1]+dp2[i+1], max);
		}
		
		System.out.println(max);
		br.close();
	}
}
