package Acmicpc.DataStructure.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedGreenColorWeakness10026 {
	static char[][] arr1 = null;
	static char[][] arr2 = null;
	static int rgc = 0;
	static int nrgc = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void fill(char[][] arr, int x, int y, char color) {
		if (x < 0 || y < 0 || x > (arr.length-1) || y > (arr[x].length-1)) return;
		
		if (arr[x][y] != color) return;
		arr[x][y] = ' ';
		
		for (int i = 0; i < dirX.length; i++) {
			fill(arr, x+dirX[i], y+dirY[i], color);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		char val = ' ';
		arr1 = new char[N][N];
		arr2 = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < N; j++) {
				val = tmp.charAt(j);
				arr1[i][j] = val;
				arr2[i][j] = val;
				if (val == 'R' || val == 'G') {
					arr2[i][j] = 'R';
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] != ' ') {
					nrgc++;
					fill(arr1, i, j, arr1[i][j]);
				}
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j] != ' ' ) {
					rgc++;
					fill(arr2, i, j, arr2[i][j]);
				}
			}
		}
		System.out.println(nrgc + " " + rgc);
	}
}
