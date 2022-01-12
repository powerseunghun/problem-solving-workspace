package Acmicpc.OrderSubmit.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeaveCompany14501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		int[] T = new int[N+1], P = new int[N+1], dp = new int[N+1];
		String tmp = null;
		
		for (int i = 1; i < dp.length; i++) {
			tmp = br.readLine();
			T[i]= Integer.parseInt(tmp.split(" ")[0]);
			P[i]= Integer.parseInt(tmp.split(" ")[1]);
			dp[i] = P[i];
		}
		
		for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < i; j++) {
				if(i-j >= T[j]) {
					dp[i] = Math.max(dp[i], dp[j] + P[i]);
				}
			}
		}
		for (int i = 1; i < dp.length; i++) {
			if (i+T[i] <= N+1) {
				max = Math.max(max, dp[i]);
			}
			if (i + T[i] >= (N+1)) continue;
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		br.close();
	}
}
