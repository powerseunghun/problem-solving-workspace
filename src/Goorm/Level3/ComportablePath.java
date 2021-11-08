package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	private int time;
	private int oneCount;
	
	public Pos(int x, int y, int t, int oc) {
		this.x = x;
		this.y = y;
		this.time = t;
		this.oneCount = oc;
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
	public int getOneCount() {
		return oneCount;
	}
	public void setOneCouont(int oneCount) {
		this.oneCount = oneCount;
	}
}
public class ComportablePath {
	static int minTime = Integer.MAX_VALUE;
	static int maxCount = Integer.MIN_VALUE;
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		Pos p = new Pos(x, y, 0, arr[x][y] == 0 ? 0 : 1);
		q.add(p);
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			check[tmp.getX()][tmp.getY()] = true;
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr[tmp.getX()].length-1) {
				if (tmp.getTime() <= minTime) {
					maxCount = Math.max(maxCount, tmp.getOneCount());
				}
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				
				
				if (!check[nx][ny]) {
					int count = tmp.getOneCount() + (arr[nx][ny] == 1 ? 1 : 0);
					q.add(new Pos(nx, ny, tmp.getTime()+1, count));
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
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		bfs(0, 0);
		System.out.println(maxCount);
	}
}
