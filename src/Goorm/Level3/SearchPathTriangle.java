package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchPathTriangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		int[][] arr = new int[N][N];
		String tmp = null;
		
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
				else {
					arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
				}
				
				max = i == arr.length-1 ? Math.max(max, arr[i][j]) : max;
			}
		}
		System.out.println(max);
		br.close();
	}
}
