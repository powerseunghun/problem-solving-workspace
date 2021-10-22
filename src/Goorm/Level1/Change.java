package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Change {
	static int[] coins = {500, 100, 50, 10};
	static int[] counts = new int[4];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int price = 1000-Integer.parseInt(br.readLine()), idx = 0;
		
		while (price != 0) {
			if (price < coins[idx]) {
				idx++;
				continue;
			}
			counts[idx]++;
			price -= coins[idx];
		}
		for (int el : counts) {
			System.out.print(el + " ");
		}
	}
}
