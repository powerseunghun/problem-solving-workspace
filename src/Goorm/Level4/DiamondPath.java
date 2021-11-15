package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiamondPath {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		int[][] arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arr[i][j] += arr[i-1][j];
				}
				else if (j == i) {
					arr[i][j] += arr[i-1][j-1];
				}
				else arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
			}
		}
		
		for (int i = N-2; i >= 0; i--) {
			tmp = br.readLine();
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		for (int i = N-2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] += Math.max(arr[i+1][j], arr[i+1][j+1]);
			}
		}
		
		System.out.println(arr[0][0]);
		br.close();
	}
}
