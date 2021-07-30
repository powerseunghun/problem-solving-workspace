package Acmicpc.GraphTheory.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KevinBaconSixLaw1389 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int A = 0, B = 0, min = Integer.MAX_VALUE;
		int[][] arr = new int[N+1][N+1];
		int[] value = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			arr[A][B] = 1;
			arr[B][A] = 1;
		}
		
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i == j) continue;
					if (arr[i][k] != 0 && arr[k][j] != 0) {
						if (arr[i][j] != 0) {
							arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
						}
						else arr[i][j] = arr[i][k] + arr[k][j]; 
					}
				}
			}
		}
		
		for (int i = 1, sum = 0; i <= N; i++, sum = 0) {
			for (int j = 1; j <= N; j++) {
				sum += arr[i][j];
			}
			value[i] = sum;
			min = Math.min(value[i], min);
		}
		
		for (int i = 1; i <= N; i++) {
			if (value[i] == min) {
				System.out.println(i);
				return;
			}
		}
	}
}
