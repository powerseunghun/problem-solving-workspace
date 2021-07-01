package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HighestValuePath4486 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+2][n+2];
		int[][] sum = new int[n+2][n+2];
		boolean[][] check = new boolean[n+2][n+2];
		Arrays.fill(arr[0], -101);
		Arrays.fill(sum[0], -101);
		Arrays.fill(arr[n+1], -101);
		Arrays.fill(sum[n+1], -101);
		for (int i = 0; i < arr[0].length; i++) {
			arr[i][0] = -101;
			sum[i][0] = -101;
		}
		for (int i = 0; i < arr[n+1].length; i++) {
			arr[i][n+1] = -101;
			sum[i][n+1] = -101;
		}
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j == 1) {
					sum[i][j] = arr[i][j];
					check[i][j] = true;
				}
				else {
					int max = -101, maxI = 0, maxJ = 0;
					if (sum[i][j-1] >= max) {
						max = sum[i][j-1];
						maxI = i;
						maxJ = j-1;
					}
					if (sum[i-1][j] >= max) {
						max = sum[i-1][j];
						maxI = i-1;
						maxJ = j;
					}
					if (sum[i][j+1] >= max) {
						max = sum[i][j+1];
						maxI = i;
						maxJ = j+1;
					}
					if (i == 1 && j == 2) {
						System.out.println("max : " + max);
					}
					sum[i][j] = arr[i][j] + max;
					check[maxI][maxJ] = true;
				}
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
