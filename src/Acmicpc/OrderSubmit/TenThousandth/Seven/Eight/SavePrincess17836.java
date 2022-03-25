package Acmicpc.OrderSubmit.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SavePrincess17836 {
	static int res = Integer.MAX_VALUE;
	static int[][] arr = null;
	static boolean[][][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(int T) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0, 0, false));
		check[0][0][0] = true;
		
		while (!q.isEmpty()) {
			Node tmp = q.poll();
			if (tmp.getT() > T) return;
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr[tmp.getX()].length-1) {
				res = Math.min(res, tmp.getT());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				
				if (!tmp.isG()) {
					if (!check[nx][ny][0] && (arr[nx][ny] == 0 || arr[nx][ny] == 2)) {
						q.add(new Node(nx, ny, tmp.getT()+1, arr[nx][ny] == 2 ? true : tmp.isG()));
						check[nx][ny][0] = true;
					}
				}
				else {
					if (!check[nx][ny][1]) {
						q.add(new Node(nx, ny, tmp.getT()+1, true));
						check[nx][ny][1] = true;
					}
				}
			}
		}
	}
	static class Node {
		private int x;
		private int y;
		private int t;
		private boolean g;
		
		public Node(int x, int y, int t, boolean g) {
			this.x = x;
			this.y = y;
			this.t = t;
			this.g = g;
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
		public int getT() {
			return t;
		}
		public void setT(int t) {
			this.t = t;
		}
		public boolean isG() {
			return g;
		}
		public void setG(boolean g) {
			this.g = g;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int T = Integer.parseInt(tmp.split(" ")[2]);
		
		arr = new int[N][M];
		check = new boolean[N][M][2];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = st.nextToken().charAt(0) - '0';
			}
		}
		bfs(T);
		System.out.println(res == Integer.MAX_VALUE ? "Fail" : res);
		br.close();
	}
}
