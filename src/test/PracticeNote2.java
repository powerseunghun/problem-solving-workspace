package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeNote2 {
	static int[][] map = null;
	static boolean[] visit = null;
	static Queue<Integer> q = null;
	static void dfs(int V) {
		visit[V] = true;
		System.out.print(V + " ");
		
		for (int i = 1; i < visit.length; i++) {
			if (map[V][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int V) {
		q = new LinkedList<>();
		q.offer(V);
		visit[V] = true;
		
		int p = 0;
		while(!q.isEmpty()) {
			p = q.poll();
			System.out.print(p + " ");
			for (int i = 1; i < visit.length; i++) {
				if (map[p][i] == 1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		int N = 0, M = 0, V = 0, r = 0, c = 0;
		N = Integer.parseInt(tmp.split(" ")[0]);
		M = Integer.parseInt(tmp.split(" ")[1]);
		V = Integer.parseInt(tmp.split(" ")[2]);
		
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		Arrays.fill(visit, false);
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			map[r][c] = 1;
			map[c][r] = 1;
		}
		
		dfs(V);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(V);
	}
}
