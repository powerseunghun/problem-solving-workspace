package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SafeArea4697 {
	static int[][] arr = null;
	static int[][] tmpArr = null;
	static int max = 1;
	static void DFS(int x, int y, int n) {
		if (x < 0 || y < 0 || x > (n-1) || y > (n-1)) {
			return;
		}
		if (tmpArr[x][y] == 0) return;
		
		tmpArr[x][y] = 0;
		DFS(x, y-1, n);
		DFS(x-1, y, n);
		DFS(x, y+1, n);
		DFS(x+1, y, n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()), rainMax = 0;
		arr = new int[n][n];
		tmpArr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				rainMax = Math.max(rainMax, arr[i][j]);
			}
		}
		for (int i = 1; i <= rainMax; i++) {
			for (int j = 0; j < tmpArr.length; j++) {
				for (int k = 0; k < tmpArr[j].length; k++) {
					if (arr[j][k] <= i) {
						tmpArr[j][k] = 0;
					}
					else tmpArr[j][k] = arr[j][k];
				}
			}
			int count = 0;
			for (int j = 0; j < tmpArr.length; j++) {
				for (int k = 0; k < tmpArr[j].length; k++) {
					if (tmpArr[j][k] != 0) {
						count++;
						DFS(j, k, n);
						max = Math.max(max, count);
					}
				}
			}
		}
		System.out.println(max);
	}
}
