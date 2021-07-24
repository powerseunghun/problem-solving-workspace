package Acmicpc.Implements.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotClearner14503 {
	static int[][] arr = null;
	static int[] dirX = {-1, 0, 1, 0};
	static int[] dirY = {0, 1, 0, -1};
	static int[] backX = {1, 0, -1, 0};
	static int[] backY = {0, -1, 0, 1};
	static int count = 0;
	static void DFS(int x, int y, int dir) {
		if (x < 0 || y < 0 || x > (arr.length-1) || y > (arr[0].length-1)) return;
		
		if (arr[x][y] == 1) return;
		if (arr[x][y] == 0) {
			arr[x][y] = 2;
			count++;
		}
		for (int i = 0, ndir = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			ndir = dir-1 >= 0 ? dir-1 : 3;
			nx = x + dirX[ndir];
			ny = y + dirY[ndir];
			
			if (arr[nx][ny] == 0) {
				DFS(nx, ny, ndir);
				return;
			}
			else dir = ndir;
		}
		int nx = x + backX[dir];
		int ny = y + backY[dir];
		DFS(nx, ny, dir);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		tmp = br.readLine();
		int r = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int dir = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		DFS(r, c, dir);
		System.out.println(count);
	}
}
