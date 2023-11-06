package Acmicpc.As.S5.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MineFind1996 {
	static char[][] arr = null;
	static int[][] resArr = null;
	static int[] dirX = {0, 0, -1, 1, -1, 1, -1, 1};
	static int[] dirY = {-1, 1, 0, 0, 1, -1, -1, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		arr = new char[N+2][N+2];
		resArr = new int[N+2][N+2];
		
		for (int i = 1; i < arr.length-1; i++) {
			str = br.readLine();
			for (int j = 1; j < arr[i].length-1; j++) {
				arr[i][j] = str.charAt(j-1);
			}
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				for (int k = 0, nx = 0, ny = 0; k < dirX.length; k++) {
					nx = i+dirX[k];
					ny = j+dirY[k];
					
					if (arr[nx][ny] != '.') continue;
					if (arr[i][j] < '0' || arr[i][j] > '9') continue;
					resArr[nx][ny] += arr[i][j]-'0';
				}
				
			}
		}
		
		for (int i = 1; i < resArr.length-1; i++) {
			for (int j = 1; j < resArr[i].length-1; j++) {
				if (arr[i][j] != '.') {
					sb.append("*");
					continue;
				}
				if (resArr[i][j] > 9) {
					sb.append("M");
					continue;
				}
				sb.append(resArr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
