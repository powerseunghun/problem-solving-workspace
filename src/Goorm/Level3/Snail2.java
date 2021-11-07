package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), th = 0, r = 0, c = -1, d = 1;;
		int[][] arr = new int[N][N];
		
		for (int value = 1; value <=  N*N; ) {
			for (int j = 0; j < N-th; j++) {
				c+= d;
				arr[r][c] = value++;
			}
			for (int j = 0; j < N-th-1; j++) {
				r += d;
				arr[r][c] = value++;
			}
			th++;
			d = -d;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(String.format("% 5d", arr[i][j]));
			}
			System.out.println();
		}
	}
}
