package Acmicpc.As.S5.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanArray14492 {
	static boolean[][] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int N = Integer.parseInt(br.readLine()), res = 0;
		arr1 = new boolean[N][N];
		arr2 = new boolean[N][N];
		
		for (int i = 0; i < arr1.length; i++) {
			str = br.readLine();
			for (int j = 0; j < str.split(" ").length; j++) {
				arr1[i][j] = Integer.parseInt(str.split(" ")[j]) == 1 ? true : false;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			str = br.readLine();
			for (int j = 0; j < str.split(" ").length; j++) {
				arr2[i][j] = Integer.parseInt(str.split(" ")[j]) == 1 ? true : false;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (arr1[i][k] && arr2[k][j]) {
						res++;
						k = N+1;
					}
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
