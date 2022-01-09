package Goorm.AlgorithmHeroes.T6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	private int x;
	private int y;
	private int time;
	
	public Info(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.time = t;
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
public class Fire {
	static int goalX = 0;
	static int goalY = 0;
	static int time = Integer.MAX_VALUE;
	static char[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean posCheck(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) return false;
		return true;
	}
	static void bfs(Queue<Info> q) {
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			if (tmp.getX() == goalX && tmp.getY() == goalY) {
				time = Math.min(time, tmp.getTime());
				break;
			}
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (!posCheck(nx, ny)) continue;
				if (!check[nx][ny] && (arr[nx][ny] == '.') || arr[nx][ny] == '&') {
					q.add(new Info(nx, ny, tmp.getTime()+1));
					check[nx][ny] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		Queue<Info> q = new LinkedList<>();
		arr = new char[R][C];
		check = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			tmp = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = tmp.split("")[j].charAt(0);
				if (arr[i][j] == '@') {
					q.add(new Info(i, j, 0));
					check[i][j] = true;
				}
				else if (arr[i][j] == '&') {
					goalX = i;
					goalY = j;
				}
			}
		}
		bfs(q);
		System.out.println(time == Integer.MAX_VALUE ? -1 : time-1);
		br.close();
	}
}
