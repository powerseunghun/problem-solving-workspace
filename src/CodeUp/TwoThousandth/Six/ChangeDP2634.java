package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChangeDP2634 {
	static int[] change = null;
	static int[] coins = null;
	static int changeDP(int money) {
		Arrays.fill(change, 2100000000);
		change[0] = 0;
		
		for (int i = 1; i <= money; i++) {
			for (int j = coins.length-1; j >= 0; j--) {
				if ((coins[j] <= i) && (change[i-coins[j]] + 1 < change[i])) {
					change[i] = change[i-coins[j]] + 1;
				}
			}
		}
		
		return change[money];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		change = new int[money+1];
		int n = Integer.parseInt(br.readLine());
		coins = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < coins.length; i++) {
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(changeDP(money));
	}
}
