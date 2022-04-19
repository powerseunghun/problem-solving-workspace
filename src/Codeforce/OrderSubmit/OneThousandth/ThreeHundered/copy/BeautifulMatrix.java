package Codeforce.OrderSubmit.OneThousandth.ThreeHundered.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BeautifulMatrix {
	static class Pos {
		private int x;
		private int y;
		private int m;
		
		public Pos(int x, int y, int m) {
			this.x = x;
			this.y = y;
			this.m = m;
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
		public int getM() {
			return m;
		}
		public void setM(int m) {
			this.m = m;
		}
	}
	static boolean[][] check = new boolean[6][6];
	static int[][] arr = new int[6][6];
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x, y, 0));
		check[x][y] = true;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getX() == 3 && tmp.getY() == 3) {
				return tmp.getM();
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 1 || ny < 1 || nx > 5 || ny > 5) continue;
				q.add(new Pos(nx, ny, tmp.getM()+1));
				check[nx][ny] = true;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int startX = 0, startY = 0;
		
		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					startX = i;
					startY = j;
				}
			}
		}
		
		System.out.println(bfs(startX, startY));
		br.close();
	}	
}
