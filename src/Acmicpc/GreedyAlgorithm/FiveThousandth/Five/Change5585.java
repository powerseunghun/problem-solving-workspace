package Acmicpc.GreedyAlgorithm.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change5585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000 - Integer.parseInt(br.readLine()), idx = 0, count = 0;
		int[] change = {500, 100, 50, 10, 5, 1};
		
		while (money != 0) {
			if (money >= change[idx]) {
				int tmp = money / change[idx];
				money -= tmp * change[idx];
				count += tmp;
			}
			else idx++;
		}
		System.out.println(count);
	}
}
