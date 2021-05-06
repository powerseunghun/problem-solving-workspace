package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrayZigZagFill1474 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]);
		int value = 1;
		char d = 'u';
		int[][] arr = new int[n][m];
		
		for (int i = arr[0].length-1; i >= 0; i--) {
			switch(d) {
			case 'u':
				for (int j = arr.length-1; j >= 0; j--) {
					arr[j][i] = value++;
				}
				break;
			case 'd':
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = value++;
				}
				break;
			}
			d = d == 'u' ? 'd' : 'u';
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
