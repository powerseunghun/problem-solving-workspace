package Acmicpc.OrderSubmit.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeaveCompany15486 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[][] arr = new int[2][N+2];
		int[] dp = new int[N+2];
		
		for (int i = 1, t = 0, p = 0; i < arr[0].length-1; i++) {
			tmp = br.readLine();
			t = Integer.parseInt(tmp.split(" ")[0]);
			p = Integer.parseInt(tmp.split(" ")[1]);
			arr[0][i] = t;
			arr[1][i] = p;
		}
		for (int i = 1; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
			if (i+arr[0][i] < dp.length) {
				dp[i+arr[0][i]] = Math.max(dp[i+arr[0][i]], arr[1][i]+max);
			}
		}
		
		System.out.println(dp[dp.length-1]);
		br.close();
	}
}
