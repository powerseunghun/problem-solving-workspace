package Acmicpc.OrderSubmit.TenThousandth.Two.Four;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class HeightOrder2458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		int[][] arr1 = new int[N+1][N+1], arr2 = new int[N+1][N+1];
		
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr1[a][b] = 1;
			arr2[b][a] = 1;
		}
		
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (arr1[i][k] != 0 && arr1[k][j] != 0) {
						arr1[i][j] = 1;
					}
					if (arr2[i][k] != 0 && arr2[k][j] != 0) {
						arr2[i][j] = 1;
					}
				}
			}
		}
		
		for (int i = 1; i < arr1.length; i++) {
			for (int j = 1; j < arr1[i].length; j++) {
				if (arr1[i][j] != 0 || arr2[i][j] != 0) {
					arr1[i][j] = 1;
				}
			}
		}
		for (int i = 1; i < arr1.length; i++) {
			boolean check = true;
			for (int j = 1; j < arr1[i].length; j++) {
				if (i == j) continue;
				if (arr1[i][j] == 0) check = false;
//				System.out.print(arr1[i][j] + " ");
			}
			if (check) res++; 
		}
		
		System.out.println(res);
		br.close();
	}
}
