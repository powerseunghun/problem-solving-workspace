package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	private int path;
	
	public Pos(int x, int y, int p) {
		this.x = x;
		this.y = y;
		this.path = p;
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

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}
}
public class ShortestPath {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int min = Integer.MAX_VALUE;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		
		q.add(new Pos(0, 0, 1));
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr[tmp.getX()].length-1) {
				min = Integer.min(min, tmp.getPath());
				continue;
			}
			check[tmp.getX()][tmp.getY()] = true;
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (!check[nx][ny] && arr[nx][ny] == 1) {
					q.add(new Pos(nx, ny, tmp.getPath()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		check = new boolean[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		bfs();
		if (min != Integer.MAX_VALUE) System.out.println(min);
		br.close();
	}
}
