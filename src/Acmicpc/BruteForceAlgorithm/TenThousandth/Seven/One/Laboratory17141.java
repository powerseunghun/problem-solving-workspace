package Acmicpc.BruteForceAlgorithm.TenThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Virus {
	private int x;
	private int y;
	private int time;
	public Virus() {
		this.x = 0;
		this.y = 0;
		this.time = 0;
	}
	public Virus(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.time = t;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getTime() {
		return this.time;
	}
}
public class Laboratory17141 {
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static ArrayList<Virus> virus = new ArrayList<>();
	static int[] virusArr = null;
	static boolean[] virusCheck = null;
	static int[][] map = null;
	static int[][] tmpMap = null;
	static boolean[][] check = null;
	static int time = Integer.MAX_VALUE;
	static boolean allSpread() {
		for (int i = 0; i < tmpMap.length; i++) {
			for (int j = 0; j < tmpMap[i].length; j++) {
				if (tmpMap[i][j] == 0) return false;
			}
		}
		return true;
	}
	static void dfs(int n, int d, int idx) {
		if (d >= n) {
			bfs();
			return;
		}
		for (int i = idx; i < virus.size(); i++) {
			if (!virusCheck[i]) {
				virusCheck[i] = true;
				virusArr[d] = i;
				dfs(n, d+1, i+1);
				virusCheck[i] = false;
			}
		}
	}
	static public void bfs() {
		int max = -1;
		for (int i = 0; i < tmpMap.length; i++) {
			for (int j = 0; j < tmpMap[i].length; j++) {
				tmpMap[i][j] = map[i][j] == 2 ? 0 : map[i][j];
			}
		}
		
		check = new boolean[map.length][map.length];
		Queue<Virus> q = new LinkedList<>();
		for (int i = 0; i < virusArr.length; i++) {
			Virus tmp = virus.get(virusArr[i]);
			q.add(tmp);
			tmpMap[tmp.getX()][tmp.getY()]=2;
		}
		
		while(!q.isEmpty()) {
			Virus tmp = q.poll();
			max = Math.max(max, tmp.getTime());
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > (tmpMap.length-1) || ny > (tmpMap[nx].length-1)) continue;
				if (!check[nx][ny] && tmpMap[nx][ny] == 0) {
					check[nx][ny] = true;
					tmpMap[nx][ny]=2;
					q.add(new Virus(nx, ny, tmp.getTime()+1));
				}
			}
		}
		if (allSpread()) {
			time = Math.min(time, max);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		map = new int[N][N];
		tmpMap = new int[N][N];
		virusArr = new int[M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					virus.add(new Virus(i, j, 0));
				}
			}
		}
		virusCheck = new boolean[virus.size()];
		dfs(M, 0, 0);
		System.out.println(time == Integer.MAX_VALUE ? -1 : time);
	}
}
