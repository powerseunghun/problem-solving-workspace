package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] dp = new int[1000001];
		int res = 0, aCount = 0, mod = (int)(Math.pow(10, 9)+7);
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i-1]*2 % mod)+1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
				aCount++;
				break;
			case 'b':
				res = ((res % mod) + (dp[aCount] % mod)) % mod;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
