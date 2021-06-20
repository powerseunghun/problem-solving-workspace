package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class loc {
	private int x;
	private int y;
	private int h;
	
	loc() {
		this.x = 0;
		this.y = 0;
		this.h = 0;
	}
	loc(int x, int y, int h) {
		this.x = x;
		this.y = y;
		this.h = h;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getH() {
		return this.h;
	}
}
public class AmusementParkBFS4039 {
	static int[][] arr = null;
	static int[][] counted = null;
//	static int[] dirX = {-1, 0, 1, 0};
//	static int[] dirY = {0, -1, 0, 1};
	static int[] dirX = {0, 1, -1, 0};
	static int[] dirY = {1, 0, 0, -1};
	static boolean checkRange(int x, int y, int n, int m) {
		if (x < 0 || x == n || y < 0 || y == m) {
			return false;
		}
		return true;
	}
	static void bfs(int x, int y, int n, int m) {
		Queue<loc> q = new LinkedList<>();
		
		loc tmp = new loc(x, y, arr[x][y]);
//		arr[x][y] = 0;
		q.add(tmp);
		counted[tmp.getX()][tmp.getY()] = 1;
		while (!q.isEmpty()) {
			tmp = q.poll();
			
			if (tmp.getX() == n && tmp.getY() == m) return;
			
			for (int i = 0; i < 4; i++) {
				int tx = tmp.getX() + dirX[i];
				int ty = tmp.getY() + dirY[i];
				if (checkRange(tx, ty, n, m) && counted[tx][ty] == 0) {
//					if (arr[tx][ty] == 0) continue;
					loc c = new loc(tx, ty, arr[tx][ty]);
					if (Math.abs(tmp.getH() - c.getH()) < 2) {
						q.add(c);
						counted[tx][ty] = counted[tmp.getX()][tmp.getY()] + 1;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[n][m];
		counted = new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		bfs(0, 0, n, m);
		System.out.println(counted[n-1][m-1]);
	}
}
