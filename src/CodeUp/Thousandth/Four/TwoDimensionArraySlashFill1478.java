package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArraySlashFill1478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]), value = 1;
		int[][] arr = new int[n][m];
		
		for (int i = 0; i <= (n+m-2); i++) {
			for (int j = 0; j < n; j++) {
				for (int k = m-1; k >= 0; k--) {
					if (j+m-k-1 == i) {
						arr[j][k] = value++;
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
