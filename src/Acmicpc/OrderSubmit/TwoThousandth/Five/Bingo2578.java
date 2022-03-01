package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bingo2578 {
	static int[][] arr = new int[5][5];
	static boolean[][] bingo = new boolean[5][5];
	static boolean check(int n) {
		int bingoCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == n) {
					bingo[i][j] = true;
				}
			}
		}
		for (int i = 0; i < bingo.length; i++) {
			if (bingo[i][0] && bingo[i][1] && bingo[i][2] 
					&& bingo[i][3] && bingo[i][4]) {
				bingoCount++;
				if (bingoCount == 3) return true;
			}
		}
		for (int i = 0; i < bingo.length; i++) {
			if (bingo[0][i] && bingo[1][i] && bingo[2][i] 
					&& bingo[3][i] && bingo[4][i]) {
				bingoCount++;
				if (bingoCount == 3) return true;
			}
		}
		if (bingo[0][0] && bingo[1][1] && bingo[2][2]
				&& bingo[3][3] && bingo[4][4]) {
			bingoCount++;
			if (bingoCount == 3) return true;
		}
		if (bingo[0][4] && bingo[1][3] && bingo[2][2]
				&& bingo[3][1] && bingo[4][0]) {
			bingoCount++;
			if (bingoCount == 3) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				count++;
				if (check(Integer.parseInt(st.nextToken()))) {
					System.out.println(count);
					br.close();
					return;
				}
			}
		}
	}
}
