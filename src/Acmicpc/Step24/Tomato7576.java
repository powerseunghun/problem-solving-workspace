package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato {
	private int x;
	private int y;
	
	Tomato() {
		this.x = 0;
		this.y = 0;
	}
	Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
}
public class Tomato7576 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(Queue<Tomato> q, int M, int N) {
		int tmpX = 0, tmpY = 0, newX = 0, newY = 0;
		while (!q.isEmpty()) {
			Tomato tmp = q.poll();
			tmpX = tmp.getX();
			tmpY = tmp.getY();
			
			for (int i = 0; i < dirX.length; i++) {
				newX = tmpX + dirX[i];
				newY = tmpY + dirY[i];
				if (newX < 1 || newY < 1 || newX > N || newY > M) {
					continue;
				}
				if (arr[newX][newY] == 0 && !check[newX][newY]) {
					check[newX][newY] = true;
					arr[newX][newY] = arr[tmpX][tmpY]+1;
					q.add(new Tomato(newX, newY));
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		Queue<Tomato> q = new LinkedList<>();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int max = 0;
		arr = new int[N+2][M+2];
		check = new boolean[N+2][M+2];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					q.add(new Tomato(i, j));
					check[i][j] = true;
				}
			}
		}
		bfs(q, M, N);
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (arr[i][j] == 0) {
					System.out.println("-1");
					return;
				}
				max = Math.max(arr[i][j], max);
			}
		}
		System.out.println(max-1);
	}
}
