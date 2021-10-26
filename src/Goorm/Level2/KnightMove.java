package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class KnightMove {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] dirY = {-2, -1, 1, 2, -2, -1, 1, 2};
	static int max = Integer.MIN_VALUE;
	static boolean validPos(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) return false;
		else return true;
	}
	static void bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0, 0));
		
		while (!q.isEmpty()) {
			Pos p = q.poll();
			check[p.getX()][p.getY()] = true;
			max = Math.max(max, p.getTime());
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = p.getX() + dirX[i];
				ny = p.getY() + dirY[i];
				if (validPos(nx, ny) && !check[nx][ny]) {
					q.add(new Pos(nx, ny, p.getTime()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		
		if ((!(R >= 2 && R <= 50)) && (!(C >= 2 && C <= 50))) {
			System.out.println("-1");
			return;
		}
		arr = new int[R][C];
		check = new boolean[R][C];

		bfs(0, 0);
		
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check[i].length; j++) {
				if (!check[i][j]) {
					System.out.println("F" + max);
					return;
				}
			}
		}
		System.out.println("T" + max);
	}
}
