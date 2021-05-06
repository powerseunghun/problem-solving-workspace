package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrayZigZagFill1470 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), value = 1;
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			switch(i % 2) {
			case 0:
				for (int j = 0; j < arr[i].length; j++) {
					arr[j][i] = value++;
				}
				break;
			case 1:
				for (int j = arr[i].length-1; j >= 0; j--) {
					arr[j][i] = value++;
				}
				break;
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
