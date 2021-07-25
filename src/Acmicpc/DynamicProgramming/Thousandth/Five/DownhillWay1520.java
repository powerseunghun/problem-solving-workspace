package Acmicpc.DynamicProgramming.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DownhillWay1520 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int count = 0;
	static int[] dirX = {0, 1, 0, -1};
	static int[] dirY = {1, 0, -1, 0};
	static void search(int x, int y, int base) {
		if (x < 0 || y < 0 || x > (arr.length-1) || y > (arr[0].length-1)) return;
		if (arr[x][y] >= base) return;
		if (check[x][y]) return;
		if (x == (arr.length-1) && y == (arr[0].length-1)) {
			count++;
			return;
		}
		check[x][y] = true;
		for (int i = 0; i < dirX.length; i++) {
			search(x+dirX[i], y+dirY[i], arr[x][y]);
		}
		check[x][y] = false;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M][N];
		check = new boolean[M][N];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		search(0, 0, 10001);
		System.out.println(count);
	}
}
