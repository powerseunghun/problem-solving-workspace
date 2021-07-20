package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Knight {
	private int x;
	private int y;
	private int seq;
	
	public Knight() {
		this.x = 0;
		this.y = 0;
		this.seq = 0;
	}
	public Knight(int x, int y, int s) {
		this.x = x;
		this.y = y;
		this.seq = s;
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
	public void setSeq(int s) {
		this.seq = s;
	}
	public int getSeq() {
		return this.seq;
	}
}
public class MoveKnight7562 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] dirY = {-2, -1, 1, 2, -2, -1, 1, 2};
	static boolean check(int x, int y, int I) {
		if (x < 0 || y < 0 || x >(I-1) || y >(I-1)) return false;
		return true;
	}
	static int bfs(int x, int y, int goalX, int goalY, int I) {
		Queue<Knight> q = new LinkedList<>();
		q.add(new Knight(x, y, 0));
		check[x][y] = true;
		
		while (!q.isEmpty()) {
			Knight tKnight = q.poll();
			int tmpX = tKnight.getX();
			int tmpY = tKnight.getY();
			int tmpS = tKnight.getSeq();
			int newX = 0, newY = 0;
			
			if (tmpX == goalX && tmpY == goalY) {
				return tmpS;
			}
			for (int i = 0; i < dirX.length; i++) {
				newX = tmpX + dirX[i];
				newY = tmpY + dirY[i];
				
				if (check(newX, newY, I) && !check[newX][newY]) {
					q.add(new Knight(newX, newY, tmpS+1));
					check[newX][newY] = true;
				}
			}
		}
		
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int I = 0, x = 0, y = 0, goalX = 0, goalY = 0;
		for (int i = 0; i < T ; i++) {
			I = Integer.parseInt(br.readLine());
			arr = new int[I][I];
			check = new boolean[I][I];
			for (int f = 0; f < check.length; f++) {
				Arrays.fill(check[f], false);
			}
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			
			tmp = br.readLine();
			goalX = Integer.parseInt(tmp.split(" ")[0]);
			goalY = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append(bfs(x, y, goalX, goalY, I) + "\n");
		}
		System.out.print(sb.toString());
	}
}
