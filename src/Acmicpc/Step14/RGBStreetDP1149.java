package Acmicpc.Step14;

import java.util.Scanner;

public class RGBStreetDP1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), min = 0;
		int[][] tCost = new int[N][3];
		int[][] cost = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			cost[i][0] = sc.nextInt();
			cost[i][1] = sc.nextInt();
			cost[i][2] = sc.nextInt();
		}
		tCost[0][0] = cost[0][0];
		tCost[0][1] = cost[0][1];
		tCost[0][2] = cost[0][2];
		
		for (int i = 1; i < N; i++) {
			tCost[i][0] = Math.min(tCost[i-1][1], tCost[i-1][2]) + cost[i][0];
			tCost[i][1] = Math.min(tCost[i-1][0], tCost[i-1][2]) + cost[i][1];
			tCost[i][2] = Math.min(tCost[i-1][1], tCost[i-1][0]) + cost[i][2];
		}
		min = Math.min(tCost[N-1][2], Math.min(tCost[N-1][0], tCost[N-1][1]));
		
//		for (int i = 0; i < tCost.length; i++) {
//			for (int j = 0; j < tCost[i].length; j++) {
//				System.out.print(tCost[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(min);
	}
}
