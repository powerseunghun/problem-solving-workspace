package Acmicpc.DynamicProgramming.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MoveInMaze11048 {
	static int[] dirX = {0, -1, -1};
	static int[] dirY = {-1, -1, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), val = 0;
		int[][] arr = new int[N+2][M+2];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				val = 0;
				for (int k = 0; k < dirX.length; k++) {
					val = Math.max(val, arr[i][j] + arr[i+dirX[k]][j+dirY[k]]);
				}
				arr[i][j] = val;
			}
		}
		System.out.println(arr[N][M]);
	}
}
