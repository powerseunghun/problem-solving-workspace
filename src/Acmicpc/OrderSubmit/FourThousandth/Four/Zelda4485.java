package Acmicpc.OrderSubmit.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
public class Zelda4485 {
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int[][] check = null;
	static int bfs(int[][] arr, int N) {
		int min = Integer.MAX_VALUE;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0, arr[0][0]));
		check[0][0] = arr[0][0];
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getX() == N-1 && tmp.getY() == N-1) {
				min = Math.min(min, tmp.getTime());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > N-1 || ny > N-1) continue;
				if (check[nx][ny] > tmp.getTime() + arr[nx][ny]) {
					check[nx][ny] = tmp.getTime() + arr[nx][ny];
					q.add(new Pos(nx, ny, tmp.getTime()+arr[nx][ny]));
				}
			}
		}
		return min;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int[][] arr = null;
		int N = 0, tc = 1;
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			arr = new int[N][N];
			check = new int[N][N];
			for (int i = 0; i < check.length; i++) {
				Arrays.fill(check[i], Integer.MAX_VALUE);
			}
			
			for (int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			sb.append("Problem " + (tc++) + ": " + bfs(arr,N) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
