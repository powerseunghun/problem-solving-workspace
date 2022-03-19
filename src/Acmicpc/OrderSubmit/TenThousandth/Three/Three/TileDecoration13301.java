package Acmicpc.OrderSubmit.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TileDecoration13301 {
	static long[] dp = new long[81];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 1 2 3  4  5
		// 4 6 10 16 26
		
		dp[0] = 2;
		dp[1] = 4;
		
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		System.out.println(dp[N]);
		br.close();
	}
}
