package Acmicpc.Step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DFSBFS1260 {
	static int[][] graph = null;
	static boolean[] check = null;
	static void dfs(int V) {
		check[V] = true;
		System.out.print(V + " ");
		
		for (int i = 1; i < check.length; i++) {
			if (graph[V][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
 	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = 0, M = 0, V = 0, t1 = 0, t2 = 0;
		
		N = Integer.parseInt(tmp.split(" ")[0]);
		M = Integer.parseInt(tmp.split(" ")[1]);
		V = Integer.parseInt(tmp.split(" ")[2]);
		
		graph = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			t1 = Integer.parseInt(tmp.split(" ")[0]);
			t2 = Integer.parseInt(tmp.split(" ")[1]);
			graph[t1][t2] = 1;
		}
		dfs(V);
		
		Arrays.fill(check, false);
		
	}
}
