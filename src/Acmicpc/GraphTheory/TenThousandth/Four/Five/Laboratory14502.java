package Acmicpc.GraphTheory.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

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
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
public class Laboratory14502 {
	static int[][] map = null;
	static int[][] tmpMap = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int max = 0;
	static void fillVirus() {
		int count = 0;
		tmpMap = new int[map.length][map[0].length];
		for (int i = 0; i < map.length; i++) {
			tmpMap[i] = map[i].clone();
		}
		Queue<Loc> q = new LinkedList<Loc>();
		
		for (int i = 0; i < tmpMap.length; i++) {
			for (int j = 0; j < tmpMap[i].length; j++) {
				if (tmpMap[i][j] == 2) {
					q.add(new Loc(i, j));
				}
			}
		}
		
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			for (int i = 0; i < dirX.length; i++) {
				int nx = tmp.getX()+dirX[i];
				int ny = tmp.getY()+dirY[i];
				if (nx >= 0 && ny >= 0 && nx < tmpMap.length && ny < tmpMap[nx].length) {
					if (tmpMap[nx][ny] == 0) {
						tmpMap[nx][ny] = 2;
						q.add(new Loc(nx, ny));
					}
				}
			}
		}
		
		for (int i = 0; i < tmpMap.length; i++) {
			for (int j = 0; j < tmpMap[i].length; j++) {
				if (tmpMap[i][j] == 0) count++;
			}
		}
		max = Math.max(count, max);
	}
	static void makeWall(int d) {
		if (d == 3) {
			fillVirus();
			return;
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					makeWall(d+1);
					map[i][j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		map = new int[N][M];
		
		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		makeWall(0);
		System.out.println(max);
	}
}
