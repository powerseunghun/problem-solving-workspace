package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class tttt {
	static int[][] arr = null;
	static boolean[] check = null;
	static void dfs(int V) {
		check[V] = true;
		System.out.print(V + " ");
		
		for (int i = 1; i < arr[V].length; i++) {
			if (arr[V][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		check[V] = true;
		
		q.add(V);
		while (!q.isEmpty()) {
			int val = q.poll();
			System.out.print(val + " ");
			for (int i = 1; i < arr[val].length; i++) {
				if (arr[val][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int V = Integer.parseInt(tmp.split(" ")[2]);
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for (int i = 0, s = 0, e = 0; i < M; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			arr[s][e] = 1;
			arr[e][s] = 1;
		}
		
		dfs(V);
		Arrays.fill(check, false);
		System.out.println();
		bfs(V);
		System.out.println();
		br.close();
	}
}
