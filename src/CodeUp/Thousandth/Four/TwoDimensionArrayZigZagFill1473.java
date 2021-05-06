package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrayZigZagFill1473 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]);
		int value = 1;
		char d = 'r';
		int[][] arr = new int[n][m];
		
		for (int i = arr.length-1; i >= 0; i--) {
			switch(d) {
			case 'l':
				for (int j = arr[i].length-1; j >= 0; j--) {
					arr[i][j] = value++;
				}
				break;
			case 'r':
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = value++;
				}
				break;
			}
			d = d == 'r' ? 'l' : 'r';
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
