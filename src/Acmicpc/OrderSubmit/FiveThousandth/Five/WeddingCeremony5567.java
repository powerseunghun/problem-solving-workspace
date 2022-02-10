package Acmicpc.OrderSubmit.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WeddingCeremony5567 {
	static int[][] arr = null;
	static Set<Integer> set = new HashSet<>();
	static int count = 0;
	static boolean[] check = null;
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		check[V] = true;
		q.add(V);
		while (!q.isEmpty()) {
			int tmp = q.poll();
			if (!set.contains(tmp)) continue;
			for (int i = 1; i < arr[tmp].length; i++) {
				if (arr[tmp][i] != 0 && !check[i]) {
					q.add(i);
					check[i] = true;
					count++;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		set.add(1);
		
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a == 1) set.add(b);
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		bfs(1);
		System.out.println(count);
		br.close();
	}
}
