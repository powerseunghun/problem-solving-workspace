package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ameba {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][N];
		
		arr[0][0] = 1;
		arr[1][0] = 1;
		
		for (int i = 1; i < arr[0].length; i++) {
			arr[0][i] = arr[0][i-1] + arr[1][i-1];
			arr[1][i] = arr[0][i-1] + 1;
		}
		
		System.out.println(arr[0][N-1] + " " + arr[1][N-1]);
		br.close();
	}
}
