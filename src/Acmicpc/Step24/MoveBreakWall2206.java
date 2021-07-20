package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class MyLoc{
	private int x;
	private int y;
	private int wall;
	private int count;
	
	public MyLoc() {
		this.x = 0;
		this.y = y;
		this.wall = 0;
		this.count = 0;
	}
	public MyLoc(int x, int y, int w, int c) {
		this.x = x;
		this.y = y;
		this.wall = w;
		this.count = c;
	}
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWall() {
		return this.wall;
	}
	public void setWall(int w) {
		this.wall = w;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int c) {
		this.count = c;
	}
}
public class MoveBreakWall2206 {
	static int[][] arr = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean[][] check1 = null;
	static boolean[][] check2 = null;
	static Map<Integer, boolean[][]> getCheck = new HashMap<>();
	static boolean check(int x, int y, int N, int M) {
		if (x < 0 || y < 0 || x > (N-1) || y > (M-1)) return false;
		else return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Queue<MyLoc> q = new LinkedList<>();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		check1 = new boolean[N][M];
		check2 = new boolean[N][M];
		
		getCheck.put(0, check1);
		getCheck.put(1, check2);
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j) - '0';
			}
		}
		
		q.add(new MyLoc(0, 0, 0, 1));
		check1[0][0] = true;
		
		while (!q.isEmpty()) {
			MyLoc t = q.poll();
			int tmpX = t.getX();
			int tmpY = t.getY();
			int tg = t.getWall();
			int tc = t.getCount();
			if (tmpX == (N-1) && tmpY == (M-1)) {
				System.out.println(tc);
				return;
			}
			int newX = 0, newY = 0;
			for (int i = 0; i < dirX.length; i++) {
				newX = tmpX + dirX[i];
				newY = tmpY + dirY[i];
				boolean[][] tmpCheck = getCheck.get(tg);
				if (check(newX, newY, N, M)) {
					if (arr[newX][newY] == 1 && tg == 0) {
						tmpCheck[newX][newY] = true;
						getCheck.put(tg, tmpCheck);
						q.add(new MyLoc(newX, newY, tg+1, tc+1));
					}
					else if (arr[newX][newY] == 0 && !tmpCheck[newX][newY]) {
						tmpCheck[newX][newY] = true;
						getCheck.put(tg, tmpCheck);
						q.add(new MyLoc(newX, newY, tg, tc+1));
					}
				}
			}
		}
		System.out.println("-1");
	}
}
