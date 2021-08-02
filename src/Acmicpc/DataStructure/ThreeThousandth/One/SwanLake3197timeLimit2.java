package Acmicpc.DataStructure.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Loc3 {
	private int x;
	private int y;
	
	public Loc3() {
		this.x = 0;
		this.y = 0;
	}
	public Loc3(int x, int y) {
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
public class SwanLake3197timeLimit2 {
	static int count = 0;
	static int swanX1 = 0, swanY1 = 0, swanX2 = 0, swanY2 = 0;
	static boolean flag = false;
	static boolean[][] check = null;
	static int[] dirX = { 0, -1, 0, 1 };
	static int[] dirY = { -1, 0, 1, 0 };
	static char[][] arr = null;
	static Queue<Loc3> melt = new LinkedList<>();
	static void bfs(int swanX1, int swanY1, int swanX2, int swanY2) {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
		Queue<Loc3> q = new LinkedList<Loc3>();
		Loc3 l = new Loc3(swanX1, swanY1);
		q.add(l);
		check[swanX1][swanY1] = true;
		
		while (!q.isEmpty()) {
			Loc3 tmp = q.poll();
			if (tmp.getX() == swanX2 && tmp.getY() == swanY2) {
				flag = true;
				return;
			}
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == 'X') continue;
				
				if (!check[nx][ny]) {
					q.add(new Loc3(nx, ny));
					check[nx][ny] = true;
				}
			}
		}
		count++;
		int loop = melt.size();
		while (loop-- > 0) {
			Loc3 tmp = melt.poll();
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				else if (arr[nx][ny] == 'X') {
					melt.add(new Loc3(nx, ny));
					arr[nx][ny] = '.';
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[R][C];
		check = new boolean[R][C];
		
		for (int i = 0, swanCount = 0; i < R; i++) {
			tmp = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == 'L') {
					swanCount++;
					if (swanCount == 1) {
						swanX1 = i;
						swanY1 = j;
					}
					else if (swanCount == 2) {
						swanX2 = i;
						swanY2 = j;
					}
				}
				else if (arr[i][j] == '.') {
					melt.add(new Loc3(i, j));
				}
			}
		}
		
		while(true) {
			bfs(swanX1, swanY1, swanX2, swanY2);
			if (flag) break;
		}
		System.out.println(count);
	}
}
