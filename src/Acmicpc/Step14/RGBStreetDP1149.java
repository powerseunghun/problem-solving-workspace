package Acmicpc.Step14;

import java.util.Scanner;

public class RGBStreetDP1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] tCost = new int[3];
		int[][] cost = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			cost[i][0] = sc.nextInt();
			cost[i][1] = sc.nextInt();
			cost[i][2] = sc.nextInt();
		}
		
		tCost[0] = cost[0][0];
		tCost[1] = cost[0][1];
		tCost[2] = cost[0][2];
		for (int i = 1; i < N; i++) {
			tCost[0] = tCost[1] >= tCost[2] ? tCost[2] + cost[i][0] : tCost[1] + cost[i][0];
			tCost[1] = tCost[0] >= tCost[2] ? tCost[2] + cost[i][1] : tCost[0] + cost[i][1];
			tCost[2] = tCost[0] >= tCost[1] ? tCost[1] + cost[i][2] : tCost[0] + cost[i][2];
		}
		
		System.out.println(tCost[0]);
		System.out.println(tCost[1]);
		System.out.println(tCost[2]);
	}
}
