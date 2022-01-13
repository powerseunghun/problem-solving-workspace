package Acmicpc.OrderSubmit.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Coin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int[] coin = new int[n], dp = new int[k+1];
		
		for (int i = 0; i < coin.length; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		Arrays.fill(dp, 10001);
		dp[0] = 0;
		
		for (int i = 0; i < coin.length; i++) {
			for (int j = coin[i]; j < dp.length; j++) {
				dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
			}
		}
		System.out.println(dp[k] == 10001 ? -1 : dp[k]);
		br.close();
	}
}
