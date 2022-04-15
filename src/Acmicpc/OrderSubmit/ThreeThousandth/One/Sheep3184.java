package Acmicpc.OrderSubmit.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Sheep3184 {
	static class Info {
		private int x;
		private int y;
		
		public Info(int x, int y) {
			this.x = x;
			this.y = y;
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
	}
	static int areaSheep = 0, areaWolf = 0;
	static int totalSheep = 0, totalWolf = 0;
	static char[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(int x, int y) {
		Queue<Info> q = new LinkedList<>();
		q.add(new Info(x, y));
		check[x][y] = true;
		if (arr[x][y] == 'v') areaWolf++;
		else if (arr[x][y] == 'o') areaSheep++;
		arr[x][y] = '#';
		
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] != '#' && !check[nx][ny]) {
					check[nx][ny] = true;
					if (arr[nx][ny] == 'o') areaSheep++;
					else if (arr[nx][ny] == 'v') areaWolf++;
					arr[nx][ny] = '#';
					q.add(new Info(nx, ny));
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
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != '#' && !check[i][j]) {
					areaSheep = 0;
					areaWolf = 0;
					bfs(i, j);
					if (!(areaSheep == 0 && areaWolf == 0)) {
						if (areaSheep > areaWolf) totalSheep += areaSheep;
						else totalWolf += areaWolf;
					}
				}
			}
		}
		
		System.out.println(totalSheep + " " + totalWolf);
		br.close();
	}
}
