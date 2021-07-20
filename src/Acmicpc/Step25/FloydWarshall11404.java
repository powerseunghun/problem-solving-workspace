package Acmicpc.Step25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FloydWarshall11404 {
	static int[][] arr = null;
	static int[][] dist = null;
	public static void main(String[] args) throws IOException {
		final int INF = 100000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int a = 0, b = 0, c = 0;
		arr = new int[n+1][n+1];
		for (int i = 1; i < arr.length; i++) {
			Arrays.fill(arr[i], INF);
		}
		
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			arr[a][b] = Math.min(arr[a][b], c);
		}
		
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				if (i == k) continue;
				for (int j = 1; j <= n; j++) {
					if (i == j || j == k) continue;
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] == INF) System.out.print("0 ");
				else System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
