package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MeetingPreparation2610 {
	static int[][] arr = null;
	static boolean[] check = null;
	static int getIdx(List<Integer> list, int V) {
		int idx = 0, minLength = Integer.MAX_VALUE/2, length = 0;
		for (int i = 1; i < arr.length; i++, length = 0) {
			if (!list.contains(i)) continue;
			for (int j = 1; j < arr[V].length; j++) {
				if (list.contains(j)) {
					length = Math.max(length, arr[i][j]);
				}
			}
			if (minLength > length) {
				minLength = length;
				idx = i;
			}
		}
		return idx;
	}
	static int bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		q.add(V);
		list.add(V);
		check[V] = true;
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			for (int i = 1; i < arr[tmp].length; i++) {
				if (arr[tmp][i] != Integer.MAX_VALUE/2 && !check[i]) {
					q.add(i);
					check[i] = true;
					list.add(i);
				}
			}
		}
		// floyd-warshall
		for (int k = 1; k < arr.length; k++) {
			for (int i = 1; i < arr.length; i++) {
				for (int j = 1; j < arr.length; j++) {
					if (arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		
		return getIdx(list, V);
	}
	static void init(int N) {
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], Integer.MAX_VALUE/2);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i != j) continue;
				arr[i][j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		init(N);
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) list.add(bfs(i));
		}
		Collections.sort(list);
		sb.append(list.size()+"\n");
		for (int el : list) {
			sb.append(el+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}
}
