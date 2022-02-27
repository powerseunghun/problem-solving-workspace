package Acmicpc.OrderSubmit.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder16928 {
	static int[] arr = new int[101];
	static boolean[] check = new boolean[101];
	static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		check[1] = true;
		int res = 0, tmp = 0, qs = 0;
		boolean isFind = false;
		
		while (!q.isEmpty()) {
			qs = q.size();
			tmp = 0;
			for (int i = 0; i < qs; i++) {
				tmp = q.poll();
				if (tmp == 100) {
					isFind = true;
					break;
				}
				
				for (int j = 1, nd = 0; j <= 6; j++) {
					nd = tmp+j;
					if (nd <= 100) {
						if (arr[nd] > 0) nd = arr[nd];
						if (!check[nd]) {
							check[nd] = true;
							q.add(nd);
						}
					}
				}
			}
			if (isFind) break;
			res++;
		}
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0, x = 0, y = 0; i < N+M; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			arr[x] = y;
		}
		
		System.out.println(bfs());
		br.close();
	}
}
