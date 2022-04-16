package Acmicpc.OrderSubmit.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parenthesis10422 {
	static long[] dp = null;
	static final long mod = 1000000007L;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), max = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < T; i++) {
			list.add(Integer.parseInt(br.readLine()));
			max = Math.max(max, list.get(list.size()-1));
		}
		
		dp = new long[max+1];
		dp[0] = dp[2] = 1;
		
		for (int i = 2; i <= max/2; i++) {
			for (int j = 0; j <= i-1; j++) {
				dp[i*2] += dp[j*2]*dp[(i-j-1)*2];
				dp[i*2] %= mod;
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(dp[list.get(i)] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
