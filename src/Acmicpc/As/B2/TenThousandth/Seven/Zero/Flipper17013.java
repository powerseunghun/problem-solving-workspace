package Acmicpc.As.B2.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flipper17013 {
	static int[][] arr = {{1,2},{3,4}};
	static void swap(char c) {
		int tmp = 0;
		if (c == 'H') {
			for (int i = 0; i < arr.length; i++) {
				tmp = arr[0][i];
				arr[0][i] = arr[1][i];
				arr[1][i] = tmp;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				tmp = arr[i][0];
				arr[i][0] = arr[i][1];
				arr[i][1] = tmp;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			swap(str.charAt(i));
		}
		
		System.out.println(arr[0][0] + " " + arr[0][1]);
		System.out.println(arr[1][0] + " " + arr[1][1]);
		br.close();
	}
}
