package Acmicpc.GreedyAlgorithm.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LaundryCEO2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), money = 0;
		int[] change = {25, 10, 5, 1}, count = new int[4];
		for (int i = 0, idx = 0; i < T; i++, idx = 0) {
			Arrays.fill(count, 0);
			money = Integer.parseInt(br.readLine());
			
			while (money != 0) {
				if (money >= change[idx]) {
					count[idx] = (money / change[idx]);
					money -= (money / change[idx]) * change[idx]; 
				}
				else idx++;
			}
			for (int el : count) {
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
