package Acmicpc.OrderSubmit.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Painting1926 {
	static int[][] arr = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int count = 0, area = 0, maxArea = Integer.MIN_VALUE;
	static void search(int x, int y) {
		area++;
		arr[x][y] = 0;
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (arr[nx][ny] == 1) search(nx, ny);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					area = 0;
					count++;
					search(i, j);
				}
				maxArea = Math.max(maxArea, area);
			}
		}
		System.out.println(count);
		System.out.println(maxArea);
	}
}
