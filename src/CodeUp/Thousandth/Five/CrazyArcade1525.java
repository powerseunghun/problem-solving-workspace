package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrazyArcade1525 {
	// need modify
	public static void main(String[] args) throws IOException {
		int[][] arr = new int[10+2][10+2];
		int n = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		for (int i = 1; i < arr.length-1; i++) {
			tmp = br.readLine();
			for (int j = 1; j < arr[i].length-1; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			
		}
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
