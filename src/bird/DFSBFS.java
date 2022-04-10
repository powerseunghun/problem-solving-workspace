package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DFSBFS {
	static int[][] graph = null;
	static boolean[] check = null;
	static void dfs(int V) {
		check[V] = true;
		System.out.print(V + " ");
		for (int i = 1; i < check.length; i++) {
			if (graph[V][i] == 1 && !check[i]) dfs(i);
		}
	}
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		check[V] = true;
		q.add(V);
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");
			for (int i = 1; i < check.length; i++) {
				if (graph[tmp][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int V = Integer.parseInt(tmp.split(" ")[2]);
		
		graph = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs(V);
		System.out.println();
		Arrays.fill(check, false);
		bfs(V);
		br.close();
	}
	
}
