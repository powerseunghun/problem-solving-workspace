package Acmicpc.GraphTheory.TenThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Party1238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int X = Integer.parseInt(tmp.split(" ")[2]), max = 0;
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 0, a = 0, b = 0, t = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			t = Integer.parseInt(tmp.split(" ")[2]);
			arr[a][b] = t;
		}
		
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i == j) continue;
					if (arr[i][k] != 0 && arr[k][j] != 0) {
						arr[i][j] = arr[i][j] == 0 ? arr[i][k] + arr[k][j] : Math.min(arr[i][k]+arr[k][j], arr[i][j]);
					}
				}
			}
		}
		for (int i = 1, val = 0; i < arr.length; i++) {
			val = arr[i][X] + arr[X][i];
			max = Math.max(val, max);
		}
		
		System.out.println(max);
	}
}
