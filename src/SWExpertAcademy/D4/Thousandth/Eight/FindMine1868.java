package SWExpertAcademy.D4.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMine1868 {
	static char[][] arr = null;
	static int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int count = 0;
	static void arrNumbering() {
		int count = 0;
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if (arr[i][j] == '*') continue;
				count = 0;
				for (int k = 0; k < dirX.length; k++) {
					if (arr[i+dirX[k]][j+dirY[k]] == '*') {
						count++;
					}
				}
				arr[i][j] = (char)(count+48);
			}
		}
	}
	static void click(int x, int y) {
		if (x < 1 || y < 1 || x > arr.length-2 || y > arr[x].length-2) {
			return;
		}
		if (arr[x][y] == '*') return;
		if (arr[x][y] == '0') {
			arr[x][y] = '-';
			for (int i = 0; i < dirX.length; i++) {
				click(x+dirX[i], y+dirY[i]);
			}
		}
		arr[x][y] = '-';
	}
	static int func() {
		int count = 0;
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length-1; j++) {
				if (arr[i][j] >= '0' && arr[i][j] <= '9') count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			count = 0;
			N = Integer.parseInt(br.readLine());
			arr = new char[N+2][N+2];
			
			for (int j = 1; j <= N; j++) {
				tmp = br.readLine();
				for (int k = 0; k < tmp.length(); k++) {
					arr[j][k+1] = tmp.charAt(k);
				}
			}
			arrNumbering();
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					if (arr[j][k] == '0') {
						click(j, k);
						count++;
					}
				}
			}
			sb.append("#" + i + " " + (count + func()) + "\n");
		}
		System.out.print(sb.toString());
	}
}
