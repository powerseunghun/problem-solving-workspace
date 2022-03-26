package Acmicpc.OrderSubmit.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighHeightBuilding1328 {
	static final int MOD = 1000000007;
	static long[][][] dp = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int R = Integer.parseInt(tmp.split(" ")[2]);
		dp = new long[101][101][101];
		
		dp[1][1][1] = 1;
		dp[2][2][1] = 1;
		dp[2][1][2] = 1;
		
		for (int i = 3; i <= N; i++) {
			for (int j = 1; j <= L; j++) {
				for (int k = 1; k <= R; k++) {
					dp[i][j][k] += (dp[i-1][j-1][k] % MOD);
					dp[i][j][k] += (dp[i-1][j][k-1] % MOD);
					dp[i][j][k] += (dp[i-1][j][k] * (i-2)) % MOD;
					dp[i][j][k] = dp[i][j][k] % MOD;
				}
			}
		}
		System.out.println(dp[N][L][R]);
		br.close();
	}
}
