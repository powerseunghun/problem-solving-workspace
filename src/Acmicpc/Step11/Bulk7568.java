package Acmicpc.Step11;

import java.util.Scanner;

public class Bulk7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), rank = 0;
		int[] weights = new int[N], heights = new int[N], ranks = new int[N];
		
		for (int i = 0; i < N; i++) {
			weights[i] = sc.nextInt();
			heights[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			rank = 1;
			for (int j = 0; j < N; j++) {
				if (i ==j) continue;
				else {
					if (weights[i] < weights[j] && heights[i] < heights[j]) {
						rank++;
					}
				}
			}
			ranks[i] = rank;
		}
		
		for (int i = 0; i < ranks.length; i++) {
			System.out.print(ranks[i] + " ");
		}
	}
}
