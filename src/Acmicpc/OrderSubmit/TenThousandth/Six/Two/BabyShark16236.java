package Acmicpc.OrderSubmit.TenThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BabyShark16236 {
	static int[][] arr = null;
	static int[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int startX = 0, startY = 0, res = 0;
	static int age = 2, eatCount = 0;
	static void bfs() {
		Queue<Info> q = new LinkedList<>();
		q.add(new Info(startX, startY, 0));
		
		while (true) {
			List<Info> fishList = new ArrayList<>();
			check = new int[arr.length][arr[0].length];
			while (!q.isEmpty()) {
				Info tmp = q.poll();
				
				for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
					nx = tmp.getX() + dirX[i];
					ny = tmp.getY() + dirY[i];
					if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
					
					if (check[nx][ny] == 0 && arr[nx][ny] <= age) {
						check[nx][ny] = check[tmp.getX()][tmp.getY()] + 1;
						Info input = new Info(nx, ny, check[nx][ny]);
						q.add(input);
						if (arr[nx][ny] < age && arr[nx][ny] >= 1 && arr[nx][ny] <= 6) {
							fishList.add(input);
						}
					}
				}
			}
			if (fishList.size() == 0) break;
			
			Collections.sort(fishList);
			Info cur = fishList.get(0);
			res += cur.getDist();
			eatCount++;
			arr[cur.getX()][cur.getY()] = 0;
			if (eatCount == age) {
				age++;
				eatCount = 0;
			}
			q.add(new Info(cur.getX(), cur.getY(), 0));
		}
	}
	static class Info implements Comparable<Info>{
		private int x;
		private int y;
		private int dist;
		
		public Info(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.dist = d;
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
		public int getDist() {
			return dist;
		}
		public void setDist(int dist) {
			this.dist = dist;
		}
		@Override
		public int compareTo(Info o) {
			if (this.getDist() == o.getDist()) {
				if (this.getX() == o.getX()) return this.getY()-o.getY();
				else return this.getX()-o.getX();
			}
			return this.getDist()-o.getDist();
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 9) {
					startX = i;
					startY = j;
					arr[i][j] = 0;
				}
			}
		}
		bfs();
		System.out.println(res);
		br.close();
	}
}
