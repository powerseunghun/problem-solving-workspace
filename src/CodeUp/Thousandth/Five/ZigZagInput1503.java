package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagInput1503 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		char d = 'r';
		
		for (int i = 0, value = 1; i < arr[0].length; i++) {
			switch(d) {
			case 'r':
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = value++;
				}
				break;
			case 'l':
				for (int j = arr[i].length-1; j >= 0; j--) {
					arr[j][i] = value++;
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
