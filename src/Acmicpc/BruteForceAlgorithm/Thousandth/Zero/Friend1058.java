package Acmicpc.BruteForceAlgorithm.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friend1058 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[][] fs = new int[N+1][N+1];
		int[][] count = new int[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == 'Y') {
					fs[i][j+1] = 1;
				}
			}
		}
		
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i== j) continue;
					if (fs[i][j] == 1 || (fs[i][k] == 1 && fs[k][j] == 1)) {
						count[i][j] = 1;
					}
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			int check = 0;
			for (int j = 1; j <= N; j++) {
				if (count[i][j] == 1) check++;
			}
			max = Math.max(check, max);
		}
		System.out.println(max);
	}
}
