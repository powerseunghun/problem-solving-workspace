package Acmicpc.BruteForceAlgorithm.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Location {
	private int x;
	private int y;
	private int dist;
	public Location() {
		this.x = 0;
		this.y = 0;
		this.dist = 0;
	}
	public Location(int x, int y, int d) {
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
	public int getDist() {
		return this.dist;
	}
}
public class TreasureIsland2589 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int max = Integer.MIN_VALUE;
	static void bfs(int x, int y) {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
		
		Queue<Location> q = new LinkedList<>();
		Location lc = new Location(x, y, 0);
		check[x][y] = true;
		
		q.add(lc);
		while(!q.isEmpty()) {
			Location t = q.poll();
			max = Math.max(t.getDist(), max);
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = t.getX() + dirX[i];
				ny = t.getY() + dirY[i];
				
				if (nx < 0 || ny < 0 || nx > (arr.length-1) || ny > (arr[nx].length-1)) continue;
				
				if(!check[nx][ny] && arr[nx][ny] == 'L') {
					q.add(new Location(nx, ny, t.getDist()+1));
					check[nx][ny] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		check = new boolean[N][M];
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 'L') bfs(i, j);
			}
		}
		System.out.println(max);
	}
}
