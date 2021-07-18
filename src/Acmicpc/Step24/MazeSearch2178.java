package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point {
	private int x;
	private int y;
	Point() {
		this.x = 0;
		this.y = 0;
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
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
}
public class MazeSearch2178 {
	static int[][] arr = null;
	static boolean[][] visit = null;
	static int[][] count = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(int x, int y, int N, int M) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		visit[x][y] = true;
		count[x][y] = 1;
		Point tmp = null;
		int tmpX = 0, tmpY = 0, newX = 0, newY = 0;
		
		while (!q.isEmpty()) {
			tmp = q.poll();
			tmpX = tmp.getX();
			tmpY = tmp.getY();
			
			if (tmpX == N && tmpY == M) break;
			
			for (int i = 0; i < dirX.length; i++) {
				newX = tmpX + dirX[i];
				newY = tmpY + dirY[i];
//				System.out.println("tmpX : " + tmpX + ", tmpY : " + tmpY);
//				System.out.println("dirX : " + dirX[i] + ", dirY : " + dirY[i]);
//				System.out.println("newX : " + newX + ", newY : " + newY);
				if (!visit[newX][newY] && arr[newX][newY] == 1) {
					visit[newX][newY] = true;
					count[newX][newY] = count[tmpX][tmpY]+1;
					q.add(new Point(newX, newY));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N+2][M+2];
		visit = new boolean[N+2][M+2];
		count = new int[N+2][M+2];
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j-1) - '0';
			}
		}
		bfs(1, 1, N, M);
		System.out.println(count[N][M]);
	}
}
