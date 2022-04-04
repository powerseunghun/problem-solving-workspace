package Acmicpc.OrderSubmit.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin9084 {
	static int[] coin = null, dp = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			coin = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < coin.length; j++) {
				coin[j] = Integer.parseInt(st.nextToken());
			}
			M = Integer.parseInt(br.readLine());
			dp = new int[M+1];
			dp[0] = 1;
			for (int j = 0; j < coin.length; j++) {
				for (int k = coin[j]; k < dp.length; k++) {
					dp[k] += dp[k-coin[j]];
				}
			}
			sb.append(dp[M] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
