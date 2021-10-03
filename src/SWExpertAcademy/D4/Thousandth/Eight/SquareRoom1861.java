package SWExpertAcademy.D4.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SquareRoom1861 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int idx = 0, move = 0;
	static void init() {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
	}
	static void search(int x, int y, int start, int m) {
		if (m > move) {
			move = m;
			idx = start;
		}
		if (m != 1 && move == m) {
			if (start < idx) {
				idx = start;
			}
		}
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (!check[nx][ny] && arr[nx][ny] == arr[x][y]+1) {
				search(nx, ny, start, m+1);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			check = new boolean[N][N];
			move = 1;
			idx = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					init();
					search(j, k, arr[j][k], 1);
				}
			}
			sb.append("#" + i + " " + idx + " " + move + "\n");
		}
		System.out.print(sb.toString());
	}
}
