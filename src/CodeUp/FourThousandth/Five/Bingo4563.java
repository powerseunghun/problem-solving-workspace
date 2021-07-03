package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bingo4563 {
	static int[][] arr = new int[5][5];
	static boolean[][] check = new boolean[5][5];
	static int x = 0, y = 0;
	static boolean bingoCheck() {
		int bingoCount = 0;
		if (check[0][0] && check[1][1] && check[2][2] && check[3][3] && check[4][4]) {
			bingoCount++;
		}
		if (check[0][4] && check[1][3] && check[2][2] && check[3][1] && check[4][0]) {
			bingoCount++;
		}
		
		for (int i = 0; i < check.length; i++) {
			if (check[i][0] && check[i][1] && check[i][2] && check[i][3] && check[i][4]) {
				bingoCount++;
			}
			if (check[0][i] && check[1][i] && check[2][i] && check[3][i] && check[4][i]) {
				bingoCount++;
			}
		}
		if (bingoCount >= 3) return true;
		return false;
	}
	static void getIdx(int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					x = i;
					y = j;
					return;
				}
			}
		}
		return;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int count = 0, val = 0;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				val = Integer.parseInt(st.nextToken());
				getIdx(val);
				count++;
				check[x][y] = true;
				if (bingoCheck()) {
					System.out.println(count);
					return;
				}
			}
		}
	}
}
