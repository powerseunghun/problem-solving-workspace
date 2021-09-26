package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Loc implements Comparable<Loc> {
	private int x;
	private int y;
	private int dist;
	public Loc(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.dist = d;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setDist(int d) {
		this.dist = d;
	}
	public int getDist() {
		return this.dist;
	}
	@Override
	public int compareTo(Loc o) {
		return this.dist - o.dist;
	}
}
public class SupplyRoute {
	static int[][] arr = null;
	static int[][] distArr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int d = 0;
	static void bfs(int x, int y) {
		PriorityQueue<Loc> q = new PriorityQueue<>();
		q.add(new Loc(x, y, 0));
		check[x][y] = true;
		
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr.length-1) {
				d = Math.min(d, tmp.getDist());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr.length-1) continue;
				if (!check[nx][ny]) {
					check[nx][ny] = true;
					q.add(new Loc(nx, ny, tmp.getDist()+arr[nx][ny]));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			check = new boolean[N][N];
			d = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				for (int k = 0; k < tmp.length(); k++) {
					arr[j][k] = tmp.charAt(k) - '0';
				}
			}
			bfs(0, 0);
			sb.append("#" + i + " " + d + "\n");
		}
		System.out.print(sb.toString());
	}
}
