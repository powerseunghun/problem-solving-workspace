package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MakeMaze2665 {
	static int res = Integer.MAX_VALUE;
	static int[][] arr = null;
	static int[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static class Pos {
		private int x;
		private int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	static void init(int N, BufferedReader br) throws IOException {
		String tmp = null;
		arr = new int[N][N];
		check = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(check[i], Integer.MAX_VALUE);
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j) - '0';
			}
		}
	}
	static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0));
		check[0][0] = 0;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr.length-1) {
				res = Math.min(res, check[tmp.getX()][tmp.getY()]);
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr.length-1) continue;
				if (check[nx][ny] > check[tmp.getX()][tmp.getY()]) {
					if (arr[nx][ny] == 1) {
						check[nx][ny] = check[tmp.getX()][tmp.getY()];
					}
					else check[nx][ny] = check[tmp.getX()][tmp.getY()]+1;
					q.add(new Pos(nx, ny));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		init(N, br);
		bfs();
		
		System.out.println(res);
	}
}
