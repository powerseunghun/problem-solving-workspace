package Acmicpc.Step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus2606 {
	static int[][] map = null;
	static boolean[] check = null;
	static Queue<Integer> q = null;
	static int bfs(int v) {
		q = new LinkedList<>();
		q.offer(v);
		check[v] = true;
		
		int count = -1, p = 0;
		while(!q.isEmpty()) {
			p = q.poll();
			count++;
			for (int i = 2; i < check.length; i++) {
				if (map[p][i] == 1 && !check[i]) {
					q.offer(i);
					check[i] = true;
				}
			}
		}
		return count;
 	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int r = 0, c = 0;
		String tmp = null;
		StringTokenizer st = null;
		
		map = new int[n+1][n+1];
		check = new boolean[n+1];
		Arrays.fill(check, false);
		
		for(int i = 0; i < m; i++) {
			tmp = br.readLine();
			st = new StringTokenizer(tmp);
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			map[r][c] = 1;
			map[c][r] = 1;
		}
		System.out.println(bfs(1));
	}
}
