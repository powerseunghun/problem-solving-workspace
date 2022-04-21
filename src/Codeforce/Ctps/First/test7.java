package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7 {
	static char[][] arr = null;
	static void move(int x, int y) {
		for (int i = x; i <= arr.length; i++) {
			// end
			if (i == arr.length) {
				arr[i-1][y] = '*';
				continue; 
			}
			
			if (arr[i][y] == '*' || arr[i][y] == 'o') {
				arr[i-1][y] = '*';
				break;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, m = 0;
		String tmp = null;
		
		for (int tc = 0; tc < t; tc++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			arr = new char[n][m];
			for (int i = 0; i < arr.length; i++) {
				tmp = br.readLine();
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = tmp.charAt(j);
				}
			}
			
			for (int i = arr.length-1; i >= 0; i--) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == '*') {
						arr[i][j] = '.';
						move(i, j);
					}
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
