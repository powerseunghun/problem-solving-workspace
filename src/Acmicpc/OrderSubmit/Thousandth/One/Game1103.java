package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

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
public class Game1103 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int bfs() {
		int max = Integer.MIN_VALUE;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0, 1));
		check[0][0] = true;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			max = Math.max(tmp.getTime(), max);
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + (dirX[i] * arr[tmp.getX()][tmp.getY()]);
				ny = tmp.getY() + (dirY[i] * arr[tmp.getX()][tmp.getY()]);
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == 10) continue;
				if (check[nx][ny]) return -1;
				else {
					check[nx][ny] = true;
					q.add(new Pos(nx, ny, tmp.getTime()+1));
				}
			}
		}
		return max;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		check = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = tmp.charAt(j) == 'H' ? 10 : tmp.charAt(j) - '0';
			}
		}
		System.out.println(bfs());
		br.close();
	}
}
