package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Position {
	private int x;
	private int y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}
public class Maze1227 {
	static int bfs(int x, int y, int goalX, int goalY) {
		Queue<Position> q = new LinkedList<>();
		q.add(new Position(x, y));
		check[x][y] = true;
		
		while (!q.isEmpty()) {
			Position tmp = q.poll();
			if (tmp.getX() == goalX && tmp.getY() == goalY) {
				return 1;
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (!check[nx][ny] && arr[nx][ny] != 1) {
					check[nx][ny] = true;
					q.add(new Position(nx, ny));
				}
			}
		}
		return 0;
	}
	static void print() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int startX = 0, startY = 0, goalX = 0, goalY = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];
			check = new boolean[100][100];
			for (int j = 0; j < arr.length; j++) {
				tmp = br.readLine();
				for (int k = 0, val = 0; k < arr[j].length; k++) {
					val = tmp.charAt(k)-'0';
					switch(val) {
					case 2:
						startX = j;
						startY = k;
						break;
					case 3:
						goalX = j;
						goalY = k;
						break;
					}
					arr[j][k] = val;
				}
			}
			sb.append("#" + i + " " + bfs(startX, startY, goalX, goalY) + "\n");
		}
		System.out.print(sb.toString());
	}
}
