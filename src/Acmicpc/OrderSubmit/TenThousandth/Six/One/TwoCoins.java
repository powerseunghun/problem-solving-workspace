package Acmicpc.OrderSubmit.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class TwoCoins {
	static int x1 = 0, y1 = 0;
	static int x2 = 0, y2 = 0;
	static char[][] arr = null;
	static boolean[][][][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static class Node {
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		private int c;
		
		public Node(int x1, int y1, int x2, int y2, int c) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.c = c;
		}
		public int getX1() {
			return x1;
		}
		public void setX1(int x1) {
			this.x1 = x1;
		}
		public int getY1() {
			return y1;
		}
		public void setY1(int y1) {
			this.y1 = y1;
		}
		public int getX2() {
			return x2;
		}
		public void setX2(int x2) {
			this.x2 = x2;
		}
		public int getY2() {
			return y2;
		}
		public void setY2(int y2) {
			this.y2 = y2;
		}
		public int getC() {
			return c;
		}
		public void setC(int c) {
			this.c = c;
		}
	}
	static boolean isWall(int nx, int ny) {
		if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[nx].length) {
			if (arr[nx][ny] == '#') return true;
		}
		return false;
	}
	static int checkedFall(int nx1, int ny1, int nx2, int ny2) {
		int cnt = 0;
		if (nx1 >= 0 && nx1 < arr.length && ny1 >= 0 && ny1 < arr[nx1].length) cnt++;
		if (nx2 >= 0 && nx2 < arr.length && ny2 >= 0 && ny2 < arr[nx2].length) cnt++;
		
		return cnt;
	}
	static int bfs() {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x1, y1, x2, y2, 0));
		check[x1][y1][x2][y2] = true;
		
		while (!q.isEmpty()) {
			Node tmp = q.poll();
			if (tmp.getC() >= 10) break;
			
			for (int i = 0, nx1 = 0, ny1 = 0, nx2 = 0, ny2 = 0; i < dirX.length; i++) {
				nx1 = tmp.getX1() + dirX[i];
				ny1 = tmp.getY1() + dirY[i];
				nx2 = tmp.getX2() + dirX[i];
				ny2 = tmp.getY2() + dirY[i];
				
				if (isWall(nx1, ny1)) {
					nx1 = tmp.getX1();
					ny1 = tmp.getY1();
				}
				if (isWall(nx2, ny2)) {
					nx2 = tmp.getX2();
					ny2 = tmp.getY2();
				}
				
				int cnt = checkedFall(nx1, ny1, nx2, ny2);
				if (cnt == 1) return tmp.getC()+1;
				else if (cnt == 2 && !check[nx1][ny1][nx2][ny2]) {
					check[nx1][ny1][nx2][ny2] = true;
					q.add(new Node(nx1, ny1, nx2, ny2, tmp.getC()+1));
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		boolean flag = false;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[N][M];
		check = new boolean[N][M][N][M];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == 'o') {
					if (!flag) {
						flag = true;
						x1 = i; y1 = j;
					}
					else {
						x2 = i; y2 = j;
					}
				}
			}
		}
		
		System.out.println(bfs());
		br.close();
	}
}
