package Acmicpc.As.S5.TenThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle16395 {
	static int[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]);
		
		arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = (j == 0 || j == i) ? 1 : arr[i-1][j-1] + arr[i-1][j];
			}
		}
		
		System.out.println(arr[n-1][k-1]);
		br.close();
	}
}
