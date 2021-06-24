package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int[][] arr = null;

	static void solution(int r, int c, int sum, int s, int turn, int dir, String route) {
		if (r < 0 || c < 0 || r >= arr.length || c >= arr.length) {
			return;
		}

		sum += arr[r][c];
		String myRoute = route.toString();
		myRoute += arr[r][c] + " ";

		if (sum > s) {
			return;
		}
		else if (sum == s) {
			System.out.println(myRoute);
			return;
		}	

		if (turn == 1) {
			if (dir == 1) {
				solution(r, c+1, sum, s, turn, dir, myRoute);
			}
			else if (dir == -1) {
				solution(r+1, c, sum, s, turn, dir, myRoute);
			}
		}
		else {
			// 처음
			if (dir == 0) {
				solution(r, c+1, sum, s, 0, 1, myRoute);
				solution(r+1, c, sum, s, 0, -1, myRoute);
			}
			else if (dir == 1) {
				solution(r, c+1, sum, s, 0, 1, myRoute);
				solution(r+1, c, sum, s, 1, -1, myRoute);
			}
			else if (dir == -1){
				solution(r, c+1, sum, s, 1, 1, myRoute);
				solution(r+1, c, sum, s, 0, -1, myRoute);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null, route = "";
		int N = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				solution(i, j, 0, S, 0, 0, route);
			}
		}
	}
}