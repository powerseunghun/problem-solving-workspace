package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Loc {
	private int x;
	private int y;
	public Loc(int x, int y) {
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
public class EggIncubator {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean isAllHatch() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) return false;
			}
		}
		return true;
	}
	static boolean validLoc(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr[x].length-1) return false;
		return true;
	}
	static int bfs(Queue<Loc> q1, Queue<Loc> q2) {
		int x = 0, y = 0, day = 0;
		for (day = 0;; day++) {
			q2 = new LinkedList<>();
			while (!q1.isEmpty()) {
				Loc tmp = q1.poll();
				x = tmp.getX();
				y = tmp.getY();
				
				for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
					nx = x + dirX[i];
					ny = y + dirY[i];
					if (validLoc(nx, ny) && !check[nx][ny] && arr[nx][ny] == 0) {
						arr[nx][ny] = 1;
						q2.add(new Loc(nx, ny));
						check[nx][ny] = true;
					}
				}
			}
			if (q2.isEmpty()) break;
			q1 = q2;
		}
		return day;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Loc> q1 = new LinkedList<>(), q2 = new LinkedList<>();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		arr = new int[M][N];
		check = new boolean[M][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
				if (arr[i][j] == 1) {
					check[i][j] = true;
					q1.add(new Loc(i, j));
				}
			}
		}
		res = bfs(q1, q2);
		
		if (isAllHatch()) System.out.println(res);
		else System.out.println("-1");
		br.close();
	}
}
