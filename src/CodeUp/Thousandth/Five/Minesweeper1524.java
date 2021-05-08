package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minesweeper1524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9+2][9+2];
		int[] d1 = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] d2 = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		int r = 0, c = 0, count = 0;
		String tmp = null;
		for (int i = 1; i <= 9; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		tmp = br.readLine();
		r = Integer.parseInt(tmp.split(" ")[0]);
		c = Integer.parseInt(tmp.split(" ")[1]);
		
		if (arr[r][c] == 1) {
			count = -1;
		}
		else {
			for (int i = 0; i < d1.length; i++) {
				if (arr[r+d1[i]][c+d2[i]] == 1) count++;
			}
		}
		System.out.println(count);
	}
}
