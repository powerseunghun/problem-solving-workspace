package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SnailArray1488 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]);
		int val = 1, dir = 0;
		int[][] arr = new int[n+2][m+2];
		int x = n, y = m;
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		// dir
		// 0 = left
		// 1 = up
		// 2 = right
		// 3 = down
		for (int i = 0; i < n*m; i++) {
			arr[x][y] = val++;
			switch(dir) {
			case 0:
				y--;
				if (y < 1 || arr[x][y] != 0) {
					dir = 1;
					y++;
					x--;
				}
				break;
			case 1:
				x--;
				if (x < 1 || arr[x][y] != 0) {
					dir = 2;
					x++;
					y++;
				}
				break;
			case 2:
				y++;
				if (y > m || arr[x][y] != 0) {
					dir = 3;
					x++;
					y--;
				}
				break;
			case 3:
				x++;
				if (x > n || arr[x][y] != 0) {
					dir = 0;
					y--;
					x--;
				}
				break;
			}
			
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
