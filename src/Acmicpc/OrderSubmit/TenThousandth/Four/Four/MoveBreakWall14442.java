package Acmicpc.OrderSubmit.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	private int w;
	private int dist;
	
	Pos (int x, int y, int w, int d) {
		this.x = x;
		this.y = y;
		this.w = w;
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
	
	public int getW() {
		return w;
	}
	
	public void setW(int w) {
		this.w = w;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}
}
public class MoveBreakWall14442 {
	static boolean[][][] check = null;
	static int[][] arr = null;
	static int res = Integer.MAX_VALUE;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		arr = new int[N][M];
		check = new boolean[N][M][K+1];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j)-'0';
			}
		}
		
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0, 0, 1));
		check[0][0][0] = true;
		
		while (!q.isEmpty()) {
			Pos p = q.poll();
			if (p.getX() == N-1 && p.getY() == M-1) {
				res = Math.min(res, p.getDist());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = p.getX() + dirX[i];
				ny = p.getY() + dirY[i];
				
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == 0 && !check[nx][ny][p.getW()]) {
					check[nx][ny][p.getW()] = true;
					q.add(new Pos(nx, ny, p.getW(), p.getDist()+1));
				}
				else if (arr[nx][ny] == 1 && p.getW() < K && !check[nx][ny][p.getW()+1]) {
					check[nx][ny][p.getW()+1] = true;
					q.add(new Pos(nx, ny, p.getW()+1, p.getDist()+1));
				}
			}
		}
		System.out.print(res == Integer.MAX_VALUE ? -1 : res);
		br.close();
		
	}
}
