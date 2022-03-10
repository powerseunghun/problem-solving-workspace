package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Loc {
	private int x;
	private int y;
	private int t;
	private int k;
	public Loc(int x, int y, int t, int k) {
		this.x = x;
		this.y = y;
		this.t = t;
		this.k = k;
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
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
}
public class FillMoon1194 {
	static char[][] arr = null;
	static boolean[][][] check = null;
	static int startX = 0, startY = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int res = Integer.MAX_VALUE;
	static void bfs() {
		Queue<Loc> q = new LinkedList<>();
		q.add(new Loc(startX, startY, 0, 0));
		check[startX][startY][0] = true;
		
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			if (arr[tmp.getX()][tmp.getY()] == '1') {
				res = Math.min(res, tmp.getT());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1 || arr[nx][ny] == '#') continue;
				if (check[nx][ny][tmp.getK()]) continue;
				
				if (arr[nx][ny] == '.' || arr[nx][ny] == '0' || arr[nx][ny] == '1') {
					check[nx][ny][tmp.getK()] = true;
					q.add(new Loc(nx, ny, tmp.getT()+1, tmp.getK()));
				}
				
				// key
				else if (arr[nx][ny] >= 'a' && arr[nx][ny] <= 'z') {
					int key = 1 << (arr[nx][ny] - 'a');
					key = tmp.getK() | key;
					if (!check[nx][ny][key]) {
						check[nx][ny][tmp.getK()] = true;
						check[nx][ny][key] = true;
						q.add(new Loc(nx, ny, tmp.getT()+1, key));
					}
				}
				
				// door
				else if (arr[nx][ny] >= 'A' && arr[nx][ny] <= 'Z') {
					int door = 1 << (arr[nx][ny] - 'A');
					if ((door & tmp.getK()) > 0) {
						check[nx][ny][tmp.getK()] = true;
						q.add(new Loc(nx, ny, tmp.getT()+1, tmp.getK()));
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[N][M];
		check = new boolean[N][M][64];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == '0') {
					startX = i;
					startY = j;
				}
			}
		}
		bfs();
		
		System.out.println(res == Integer.MAX_VALUE ? -1 : res);
		br.close();
	}
}
