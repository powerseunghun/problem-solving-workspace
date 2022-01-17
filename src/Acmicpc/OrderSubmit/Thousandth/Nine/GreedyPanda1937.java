package Acmicpc.OrderSubmit.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
	private int x;
	private int y;
	private int time;
	public Pos(int x, int y, int t) {
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

// TLE
public class GreedyPanda1937 {
	static int[][] arr = null;
	static int[][] memo = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int bfs(int x, int y) {
		int maxPath = 0;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x, y, 1));
		check[x][y] = true;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			
			if (memo[tmp.getX()][tmp.getY()] != 0) {
				maxPath += memo[tmp.getX()][tmp.getY()];
				break;
			}
			maxPath = Math.max(maxPath, tmp.getTime());
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (!check[nx][ny] && arr[tmp.getX()][tmp.getY()] < arr[nx][ny]) {
					check[nx][ny] = true;
					q.add(new Pos(nx, ny, tmp.getTime()+1));
				}
			}
		}
		memo[x][y] = maxPath;
		return maxPath;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), maxPath = Integer.MIN_VALUE;
		arr = new int[N][N];
		memo = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				check = new boolean[N][N];
				maxPath = Math.max(maxPath, bfs(i, j));
			}
		}
		System.out.println(maxPath);
		br.close();
	}
}
