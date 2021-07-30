package Acmicpc.GraphTheory.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Floyd11404 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int A = 0, B = 0, cost = 0;
		int[][] arr = new int[N+1][N+1];
		String tmp = null;
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			cost = Integer.parseInt(tmp.split(" ")[2]);
			arr[A][B] = arr[A][B] == 0 ? cost : Math.min(arr[A][B], cost);
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
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
