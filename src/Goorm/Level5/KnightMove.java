package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class KnightMove {
	static int startX = 0, startY = 0;
	static int goalX  = 0, goalY = 0;
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] dirY = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int count = Integer.MAX_VALUE;
	static boolean validCheck(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr[x].length-1) return false;
		return true;
	}
	static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(startX, startY, 0));
		check[startX][startY] = true;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getX() == goalX && tmp.getY() == goalY) {
				count = Math.min(count, tmp.getPath());
				break;
			}
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (validCheck(nx, ny) && !check[nx][ny]) {
					check[nx][ny] = true;
					q.add(new Pos(nx, ny, tmp.getPath()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		check = new boolean[N][N];
		String tmp = null;
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			switch(i) {
			case 0:
				startX = Integer.parseInt(tmp.split(" ")[0]);
				startY = Integer.parseInt(tmp.split(" ")[1]);
				break;
			case 1:
				goalX = Integer.parseInt(tmp.split(" ")[0]);
				goalY = Integer.parseInt(tmp.split(" ")[1]);
				break;
			}
		}
		bfs();
		
		System.out.println(count);
		br.close();
	}
}
