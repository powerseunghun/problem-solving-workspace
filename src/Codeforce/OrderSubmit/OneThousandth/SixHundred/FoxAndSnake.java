package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FoxAndSnake {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[n][m];
		
		for (int i = 0, flag = m-1; i < arr.length; i++) {
			Arrays.fill(arr[i], '.');
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = '#';
				}
				else {
					if (j == flag) {
						arr[i][j] = '#';
						flag = flag == m-1 ? 0 : m-1;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
