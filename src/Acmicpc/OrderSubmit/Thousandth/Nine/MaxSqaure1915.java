package Acmicpc.OrderSubmit.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSqaure1915 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		
		int[][] arr = new int[n+1][m+1], dp = new int[n+1][m+1];
		
		for (int i = 1; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j-1) - '0';
			}
		}
		if (n == 1 && m == 1) {
			System.out.println("1");
			return;
		}
		dp[1][1] = arr[1][1];
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i == 1 && j == 1 || arr[i][j] != 1) continue;
				if (arr[i][j] != 1) continue;
				dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1])+1;
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max * max);
		br.close();
	}
}
