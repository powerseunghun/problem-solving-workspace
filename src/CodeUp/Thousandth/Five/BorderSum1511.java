package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BorderSum1511 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		int[][] arr = new int[N][N];
		
		for (int i = 0, value = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++; 
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length-1) {
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
				}
 			}
			else {
				sum += (arr[i][0] + arr[i][arr[i].length-1]);
			}
		}
		System.out.println(sum);
	}
}
