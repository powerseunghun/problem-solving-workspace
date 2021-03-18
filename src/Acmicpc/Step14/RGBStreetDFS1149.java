package Acmicpc.Step14;

import java.io.IOException;
import java.util.Scanner;

public class RGBStreetDFS1149 {
	static int[] array = null;
	static int[][] cost = null;
	static int min = 2100000000;
	public void dfs(int N, int d, int at) {
		if (d == N) {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			if (sum <= min) {
				min = sum;
			}
			return;
		}
		else {
			for (int i = 0; i < 3; i++) {
				if (i == at) continue;
				array[d] = cost[d][i];
				dfs(N, d + 1, i);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		cost = new int[N][3];
		array = new int[N];
		
		for (int i = 0; i < N; i++) {
			cost[i][0] = sc.nextInt();
			cost[i][1] = sc.nextInt();
			cost[i][2] = sc.nextInt();
		}
		
		// 47% TimeOver
		new RGBStreetDFS1149().dfs(N, 0, -1);
		System.out.println(min);
	}
}
