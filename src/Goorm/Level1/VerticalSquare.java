package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerticalSquare {
	static void init(int[][] arr) {
		int val = 1;
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = val++;
			}
		}
	}
	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		
		init(arr);
		print(arr);
	}
}
