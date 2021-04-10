package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeNote {
	static int[][] map = null;
	static boolean[] visit = null;
	static Queue<Integer> q = null;
	static void dfs(int r) {
		visit[r] = true;
		System.out.print(r + " ");
		
		for (int i = 0; i < visit.length; i++) {
			if (map[r][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	static void bfs(int r) {
		q = new LinkedList<>();
		q.offer(r);
		visit[r] = true;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.print(v + " ");
			for (int i = 1; i < visit.length; i++) {
				if (map[v][i] == 1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		map = new int[5][5];
		visit = new boolean[5];
		Arrays.fill(visit, false);
		
		map[0][1] = 1;
		map[0][2] = 1;
		map[0][4] = 1;
		map[1][2] = 1;
		map[2][3] = 1;
		map[2][4] = 1;
		map[3][4] = 1;
		
		dfs(0);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(0);
	}
}
