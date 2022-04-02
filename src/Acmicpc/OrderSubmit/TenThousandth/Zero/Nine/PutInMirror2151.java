package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PutInMirror2151 {
	static char[][] arr = null;
	static boolean[][][] check = null;
	static int[] dirX = {-1, 0, 1, 0};
	static int[] dirY = {0, 1, 0, -1};
	static int startX = 0, startY = 0;
	static boolean isInitPos = false;
	static int res = 0;
	static class Info implements Comparable<Info> {
		private int x;
		private int y;
		private int d;
		private int c;
		
		public Info(int x, int y, int d, int c) {
			this.x = x;
			this.y = y;
			this.d = d;
			this.c = c;
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
		public int getD() {
			return d;
		}
		public void setD(int d) {
			this.d = d;
		}
		public int getC() {
			return c;
		}
		public void setC(int c) {
			this.c = c;
		}
		@Override
		public int compareTo(Info o) {
			return this.getC() - o.getC();
		}
	}
	static void bfs() {
		PriorityQueue<Info> pq = new PriorityQueue<>();
		for (int i = 0; i < dirX.length; i++) {
			pq.add(new Info(startX, startY, i, 0));
		}
		
		int nx = 0, ny = 0;
		while (!pq.isEmpty()) {
			Info tmp = pq.poll();
			if (arr[tmp.getX()][tmp.getY()] == '#') {
				res = tmp.getC();
				return;
			}
			nx = tmp.getX()+dirX[tmp.getD()];
			ny = tmp.getY()+dirY[tmp.getD()];
			
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (arr[nx][ny] == '*' || check[nx][ny][tmp.getD()]) continue;
			
			check[nx][ny][tmp.getD()] = true;
			if (arr[nx][ny] == '!') {
				pq.add(new Info(nx, ny, (tmp.getD()+1)%dirX.length, tmp.getC()+1));
				pq.add(new Info(nx, ny, (tmp.getD()+3)%dirX.length, tmp.getC()+1));
			}
			pq.add(new Info(nx, ny, tmp.getD(), tmp.getC()));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		arr = new char[N][N];
		check = new boolean[N][N][4];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == '#' && !isInitPos) {
					startX = i;
					startY = j;
					arr[i][j] = '*';
					isInitPos = true;
				}
			}
		}
		bfs();
		
		System.out.println(res);
		br.close();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
