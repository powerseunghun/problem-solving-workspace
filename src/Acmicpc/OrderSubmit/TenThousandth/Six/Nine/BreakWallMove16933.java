package Acmicpc.OrderSubmit.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BreakWallMove16933 {
	static class Node {
		private int x;
		private int y;
		private int c;
		private int w;
		
		public Node(int x, int y, int c, int w) {
			this.x = x;
			this.y = y;
			this.c = c;
			this.w = w;
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
		public int getC() {
			return c;
		}
		public void setC(int c) {
			this.c = c;
		}
		public int getW() {
			return w;
		}
		public void setW(int w) {
			this.w = w;
		}
	}
	static int bfs(int N, int M, int K) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(1, 1, 0, 0));
		check[1][1][0][0] = true;
		
		while (!q.isEmpty()) {
			Node tmp = q.poll();
			if (tmp.getX() == N && tmp.getY() == M) {
				return tmp.getC();
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 1 || ny < 1 || nx > N || ny > M) continue;
				
				if (arr[nx][ny] == 0) {
					int day = tmp.getC() % 2 == 0 ? 1 : 0;
					if (!check[nx][ny][tmp.getW()][day]) {
						check[nx][ny][tmp.getW()][day] = true;
						q.add(new Node(nx, ny, tmp.getC()+1, tmp.getW()));
					}
				}
				else if (arr[nx][ny] == 1){
					if (tmp.getW() >= K) continue;
					int nDay = tmp.getC() % 2 == 0 ? 1 : 0;
					
					// wall break
					if (nDay == 1 && !check[nx][ny][tmp.getW()+1][nDay]) {
						check[nx][ny][tmp.getW()+1][nDay] = true;
						q.add(new Node(nx, ny, tmp.getC()+1, tmp.getW()+1));
					}
					else if (nDay == 0 && !check[tmp.getX()][tmp.getY()][tmp.getW()][nDay]) {
						check[tmp.getX()][tmp.getY()][tmp.getW()][nDay] = true;
						q.add(new Node(tmp.getX(), tmp.getY(), tmp.getC()+1, tmp.getW()));
					}
				}
			}
		}
		
		return -1;
	}
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int[][] arr = null;
	static boolean[][][][] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]), res = 0;
		
		arr = new int[N+1][M+1];
		check = new boolean[N+1][M+1][K+1][2];
		
		for (int i = 1; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j-1)-'0';
			}
		}
		res = bfs(N, M, K);
		System.out.println(res == -1 ? -1 : (res+1));
		br.close();
	}
}
