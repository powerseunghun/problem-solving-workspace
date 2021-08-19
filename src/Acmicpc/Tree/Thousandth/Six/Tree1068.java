package Acmicpc.Tree.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Tree1068 {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static boolean[] check = null;
	static int delNumber = 0, start = 0;
	static Set<Integer> set = new HashSet<>();
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			if (tmp == delNumber) continue;
			set.add(tmp);
			check[tmp] = true;
			for (int i = 0; i < list.get(tmp).size(); i++) {
				int nextNode = list.get(tmp).get(i);
				if (nextNode == delNumber) continue;
				if (check[nextNode]) continue;
				q.add(nextNode);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), parent = 0, count = 0;
		check = new boolean[N];
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<>());
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			parent = Integer.parseInt(st.nextToken());
			if (parent == -1) {
				start = i;
				continue;
			}
			list.get(parent).add(i);
		}
		delNumber = Integer.parseInt(br.readLine());
		bfs(start);
		
		Object[] oArr = set.toArray();
		for (int i = 0, idx = 0; i < oArr.length; i++) {
			idx = (int)oArr[i];
			boolean flag = true;
			for (int j = 0; j < list.get(idx).size(); j++) {
				if (check[list.get(idx).get(j)]) {
					flag = false;
					break;
				}
			}
			if(flag) count++;
		}
		
		System.out.println(count);
	}
}
