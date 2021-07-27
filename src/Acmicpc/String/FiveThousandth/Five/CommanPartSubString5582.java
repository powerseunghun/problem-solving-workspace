package Acmicpc.String.FiveThousandth.Five;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class CommanPartSubString5582 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		int max = 0;
		
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					max = Math.max(dp[i][j], max);
				}
			}
		}
		System.out.println(max);
	}
}
