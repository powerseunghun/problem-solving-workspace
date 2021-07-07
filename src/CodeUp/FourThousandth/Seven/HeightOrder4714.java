package CodeUp.FourThousandth.Seven;

import java.io.IOException;
import java.util.Scanner;

public class HeightOrder4714 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int count = 0;
		boolean flag = true;
		int[][] arr = new int[n+1][n+1];
		
		for (int i = 0, x = 0, y = 0; i < m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			arr[x][y] = 1;
		}
		
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (arr[i][k] == 1 && arr[k][j] == 1) arr[i][j] = 1;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			flag = true;
			for (int j = 1; j <= n; j++) {
				if (i == j) continue;
				if (arr[i][j] == 0 && arr[j][i] == 0) {
					flag = false;
				}
			}
			if (flag) count++;
		}
		System.out.println(count);
	}
}
