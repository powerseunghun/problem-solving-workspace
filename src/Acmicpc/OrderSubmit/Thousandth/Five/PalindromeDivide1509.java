package Acmicpc.OrderSubmit.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PalindromeDivide1509 {
	static int[] dp = null;
	static boolean[][] check = null;
	static void init(int length) {
		check = new boolean[length+1][length+1];
		dp = new int[length+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int c = 0, l = 0, r = 0;
		init(str.length());
		
		for (int i = 1; i < check.length; i++) {
			for (int j = i; j < check[i].length; j++, c = 0) {
				l = i-1;
				r = j-1;
				while (l <= r) {
					if (str.charAt(l++) != str.charAt(r--)) {
						c = 1;
						break;
					}
				}
				if (c == 0) check[i][j] = true;
			}
		}
		for (int i = 1; i < check.length; i++) {
			for (int j = 1; j <= i; j++) {
				if (check[j][i]) dp[i] = Math.min(dp[i], dp[j-1]+1);
			}
		}
		
		System.out.println(dp[str.length()]);
		br.close();
	}
}
