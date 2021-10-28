package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MineFind {
	static int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		char[][] arr = new char[N+2][M+2];
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = tmp.charAt(j-1);
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (arr[i][j] == '.') {
					int count = 0;
					for (int k = 0; k < dirX.length; k++) {
						if (arr[i+dirX[k]][j+dirY[k]] == '*') count++;
					}
					arr[i][j] = (char)(count+48);
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
 	}
}
