package Acmicpc.OrderSubmit.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int l;
	private int x;
	private int y;
	private int time;
	
	public Pos(int l, int x, int y, int t) {
		this.l = l;
		this.x = x;
		this.y = y;
		this.time = t;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
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
public class SangbumBuilding6593 {
	static int L = 0, R = 0, C = 0;
	static int startL = 0, startX = 0, startY = 0;
	static int goalL = 0, goalX = 0, goalY = 0;
	static int minTime = Integer.MAX_VALUE;
	static int[] dirL = {-1, 1};
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static char[][][] arr = null;
	static boolean[][][] check = null;
	static void init() {
		minTime = Integer.MAX_VALUE;
		arr = new char[L][R][C];
		check = new boolean[L][R][C];
	}
	static boolean checkL(int nl) {
		if (nl < 0 || nl > (L-1)) return false;
		return true;
	}
	static boolean checkPos(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > (R-1) || ny > (C-1)) return false;
		return true;
	}
	static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		check[startL][startX][startY] = true;
		q.add(new Pos(startL, startX, startY, 0));
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getL() == goalL && tmp.getX() == goalX && tmp.getY() == goalY) {
				minTime = Math.min(minTime, tmp.getTime());
				continue;
			}
			
			for (int i = 0, nl = 0; i < dirL.length; i++) {
				nl = tmp.getL() + dirL[i];
				if (checkL(nl) && !check[nl][tmp.getX()][tmp.getY()] && arr[nl][tmp.getX()][tmp.getY()] != '#') {
					check[nl][tmp.getX()][tmp.getY()] = true;
					q.add(new Pos(nl, tmp.getX(), tmp.getY(), tmp.getTime()+1));
				}
			}
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (checkPos(nx, ny) && !check[tmp.getL()][nx][ny] && arr[tmp.getL()][nx][ny] != '#') {
					check[tmp.getL()][nx][ny] = true;
					q.add(new Pos(tmp.getL(), nx, ny, tmp.getTime()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			L = Integer.parseInt(tmp.split(" ")[0]);
			R = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			if (L == 0 && R == 0 && C == 0) break;
			
			init();
			for (int i = 0; i < L; i++) {
				for (int j = 0; j < R; j++) {
					tmp = br.readLine();
					for (int k = 0; k < C; k++) {
						arr[i][j][k] = tmp.charAt(k);
						if (arr[i][j][k] == 'S') {
							startL = i;
							startX = j;
							startY = k;
						}
						else if (arr[i][j][k] == 'E') {
							goalL = i;
							goalX = j;
							goalY = k;
						}
					}
				}
				br.readLine();
			}
			
			bfs();
			sb.append(minTime == Integer.MAX_VALUE ? "Trapped!\n" : "Escaped in " + minTime + " minute(s).\n");
		}
		System.out.print(sb.toString());
	}
}
