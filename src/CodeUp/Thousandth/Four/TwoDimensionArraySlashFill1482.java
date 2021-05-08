package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArraySlashFill1482 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]), value = 1;
		int[][] arr = new int[n][m];
		
		for (int i = (n+m-1); i >= 0; i--) {
			for (int j = m-1; j >= 0; j--) {
				for (int k = 0; k < n; k++) {
					if (k+m-j-1 == i) {
						arr[k][j] = value++;
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
