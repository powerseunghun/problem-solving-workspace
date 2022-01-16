package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Problem3CS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] money_spent = null;
		Integer[] money_must_spent = null;
		
		while (true) {
			int i = 0, n = 0;
			int all_money_spent = 0;
			int each_money_spent = 0;
			int money_exchange = 0;
			
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			money_spent = new Integer[n];
			money_must_spent = new Integer[n];
			
			for (i = 0; i < n; i++) {
				double temp = Double.parseDouble(br.readLine());
				money_spent[i] = (int)(temp * 100 + 0.5);
				all_money_spent += money_spent[i];
			}
			Arrays.sort(money_spent, Collections.reverseOrder());
			
			each_money_spent = all_money_spent / n;
			for (i = 0; i < n; i++) {
				money_must_spent[i] = each_money_spent;
			}
			all_money_spent %= n;
			
			for (i = 0; i < all_money_spent; i++) {
				money_must_spent[i]++;
			}
			for (i = 0; i < n; i++) {
				money_exchange += Math.abs(money_spent[i] - money_must_spent[i]);
			}
			money_exchange /= 2;
			System.out.printf("%.2f\n", money_exchange / 100.0);
		}
		br.close();
	}
}
