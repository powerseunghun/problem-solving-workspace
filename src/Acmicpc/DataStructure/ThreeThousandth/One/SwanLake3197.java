package Acmicpc.DataStructure.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Loc {
	private int x;
	private int y;
	
	public Loc() {
		this.x = 0;
		this.y = 0;
	}
	public Loc(int x, int y) {
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
//3Fail  // 2 timeLimit // 1 wrong answer
//탐색 지역을 미리(X인 부분) 큐에 넣어놓는 로직이 중요함
public class SwanLake3197 {
	static int count = 0;
	static int swanX1 = 0, swanY1 = 0, swanX2 = 0, swanY2 = 0;
	static int[] dirX = { 0, -1, 0, 1 };
	static int[] dirY = { -1, 0, 1, 0 };
	static char[][] arr = null;
	static boolean[][] check = null;
	static Queue<Loc> melt = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Queue<Loc> q = new LinkedList<>();
		Queue<Loc> water = new LinkedList<>();
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
				if (arr[i][j] != 'X') water.add(new Loc(i, j));
			}
		}
		
		q.add(new Loc(swanX1, swanY1));
		check[swanX1][swanY1] = true;
		while (true) {
			Queue<Loc> next = new LinkedList<>();
			while (!q.isEmpty()) {
				Loc t = q.poll();
				if (t.getX() == swanX2 && t.getY() == swanY2) {
					System.out.println(count);
					return;
				}
				for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
					nx = t.getX() + dirX[i];
					ny = t.getY() + dirY[i];
					
					if (nx < 0 || ny < 0 
							|| nx > (arr.length-1) || ny > (arr[nx].length-1) 
							|| check[nx][ny]) continue;
					check[nx][ny] = true;
					if (arr[nx][ny] == 'X') {
						next.add(new Loc(nx, ny));
						continue;
					}
					q.add(new Loc(nx, ny));
				}
			}
			
			q = next;
			count++;
			int loop = water.size();
			while (loop-- > 0) {
				Loc t = water.poll();
				for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
					nx = t.getX() + dirX[i];
					ny = t.getY() + dirY[i];
					
					if (nx < 0 || ny < 0 || nx > (arr.length-1) || ny > (arr[nx].length-1)) continue;
					
					if (arr[nx][ny] == 'X') {
						arr[nx][ny] = '.';
						water.add(new Loc(nx, ny));
					}
				}
			}
		}
		
	}
}
