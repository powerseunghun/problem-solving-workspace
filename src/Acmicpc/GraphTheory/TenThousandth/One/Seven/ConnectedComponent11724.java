package Acmicpc.GraphTheory.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectedComponent11724 {
	static int[][] arr = null;
	static boolean[] check = null;
	static void dfs(int vertex) {
		check[vertex] = true;
		for (int i = 1; i < arr[vertex].length; i++) {
			if (arr[vertex][i] != 0 && !check[i]) {
				dfs(i);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int u = 0, v = 0, count = 0;
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			u = Integer.parseInt(tmp.split(" ")[0]);
			v = Integer.parseInt(tmp.split(" ")[1]);
			arr[u][v] = 1;
			arr[v][u] = 1;
		}
		
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
