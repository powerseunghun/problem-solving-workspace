package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberContours1512 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), w = 0;
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]), Y = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
//		arr[X-1][Y-1] = 1;
		
		for (int i = X-1, value = 1; i >= 0; i--, value++) {
			value = 1 + w;
			for (int j = Y-1; j >= 0; j--) {
				arr[i][j] = value++;
			}
			w++;
		}
		w = 1;
		
		for (int i = X, value = 1; i < arr.length; i++) {
			value = 1 + w;
			for (int j = Y-1; j >= 0; j--) {
				arr[i][j] = value++;
			}
			w++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = Y; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j-1] + 1;
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
