package Acmicpc.As.B3.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M34917 {
	static char[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			arr = new char[N][N];
			
			for (int i = 0; i < arr.length; i++) {
				Arrays.fill(arr[i], ',');
				arr[i][0] = '#';
				arr[i][N-1] = '#';
			}
			for (int i = 0; i < N/2; i++) {
				arr[i][i] = '#';
				arr[i][N-1-i] = '#';
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
