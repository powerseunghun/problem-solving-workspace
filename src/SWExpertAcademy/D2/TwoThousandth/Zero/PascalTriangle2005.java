package SWExpertAcademy.D2.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PascalTriangle2005 {
	static void pascalTriangle(int N, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = j == 0 ? 1 : arr[i-1][j-1] + arr[i-1][j];
			}
		}
	}
	static void print(int N, int[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[][] arr = null;
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			System.out.println("#" + i);
			pascalTriangle(N, arr);
			print(N, arr);
		}
		
	}
}
