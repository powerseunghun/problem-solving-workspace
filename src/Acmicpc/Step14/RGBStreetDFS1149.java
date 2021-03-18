package Acmicpc.Step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
		cost = new int[N][3];
		array = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		// BufferedReader + StringTokenizer 48% TimeOver
		// Scanner = 47% TimeOver
		new RGBStreetDFS1149().dfs(N, 0, -1);
		System.out.println(min);
	}
}
