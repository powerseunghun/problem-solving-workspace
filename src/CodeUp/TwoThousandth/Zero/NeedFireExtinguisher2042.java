package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeedFireExtinguisher2042 {
	static boolean aroundCheck(int[][] arr, int x, int y) {
		int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
		int tmpX = 0, tmpY = 0, count = 0;
		for (int i = 0; i < dirX.length; i++) {
			tmpX = x + dirX[i];
			tmpY = y + dirY[i];
			if (tmpX < 0 || tmpY < 0 || tmpX > arr.length-2 || tmpY > arr.length-2) {
				continue;
			}
			if (arr[tmpX][tmpY] == 0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), max = 0, maxX = 0, maxY = 0;
		int k = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+2][N+2];
		int[] k3dirX = {-1, -1, -1, 0, 0, 1, 1, 1}, k3dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
		int[] k5dirX = {-2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
		int[] k5dirY = {-2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2};
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int tmpX = 0, tmpY = 0, count = 0;
				if (arr[i][j] != 0) continue;
				if (!aroundCheck(arr, i, j)) continue;
				switch(k) {
				case 3:
					for (int dir = 0; dir < k3dirX.length; dir++) {
						tmpX = i+k3dirX[dir];
						tmpY = j+k3dirY[dir];
						if (tmpX < 0 || tmpY < 0 || tmpX > N || tmpY > N) {
							continue;
						}
						if (arr[tmpX][tmpY] == 1) count++;
					}
					if (count > max) {
						max = count;
						maxX = i;
						maxY = j;
					}
					break;
				case 5:
					for (int dir = 0; dir < k5dirX.length; dir++) {
						tmpX = i+k5dirX[dir];
						tmpY = j+k5dirY[dir];
						if (tmpX < 0 || tmpY < 0 || tmpX > N || tmpY > N) {
							continue;
						}
						if (arr[tmpX][tmpY] == 1) count++;
					}
					if (count > max) {
						max = count;
						maxX = i;
						maxY = j;
					}
					break;
				}
			}
		}
		if (maxX == 0 && maxY == 0) System.out.println("119");
		else System.out.println(maxX + " " + maxY);
	}
}
