package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArray1096 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[20][20];
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), r = 0, c = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			arr[r][c] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
