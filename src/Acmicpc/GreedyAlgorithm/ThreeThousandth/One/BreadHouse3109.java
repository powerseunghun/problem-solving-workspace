package Acmicpc.GreedyAlgorithm.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreadHouse3109 {
	static int count = 0;
	static char[][] arr = null;
	static int[] dirX = {-1, 0, 1};
	static boolean dfs(int x, int y) {
		if (y == arr[x].length-1) {
//			System.out.println("x : " + x + ", y : " + y);
			count++;
			return true;
		}
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + 1;
			if (nx < 0 || ny < 0 || nx > (arr.length-1) || ny > arr[nx].length-1 || arr[nx][ny] == 'x') continue;
			arr[nx][ny] = 'x';
			if(dfs(nx, ny)) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[R][C];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		for (int i = 0; i < R; i++) {
			dfs(i, 0);
		}
		System.out.println(count);
	}
}
