package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Virus4503 {
	static int[][] arr = null;
	static boolean[] check = null;
	static Queue<Integer> q = new LinkedList<>();
	static int bfs(int n) {
		q.add(n);
		check[n] = true;
		
		int count = -1, p = 0;
		
		while (!q.isEmpty()) {
			p = q.poll();
			count++;
			for (int i = 2; i < check.length; i++) {
				if (arr[p][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		arr = new int[n+2][n+2];
		check = new boolean[n+1];
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			int x = Integer.parseInt(tmp.split(" ")[0]);
			int y = Integer.parseInt(tmp.split(" ")[1]);
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		System.out.println(bfs(1));
	}
}
