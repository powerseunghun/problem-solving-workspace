package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalRead {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.split(" ")[j].charAt(0);
			}
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[j][i]);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
