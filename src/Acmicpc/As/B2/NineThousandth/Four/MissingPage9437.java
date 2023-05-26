package Acmicpc.As.B2.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingPage9437 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int N = 0, P = 0, v = 1;
		
		while (true) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			if (N == 0) break;
			
			P = Integer.parseInt(str.split(" ")[1]);
			v = 1;
			
			arr = new int[N/4][4];
			
			for (int i = 0; i < arr.length; i++, v += 2) {
				arr[i][0] = v;
				arr[i][1] = v + 1;
				arr[i][2] = N - v;
				arr[i][3] = N - v + 1;
			}
			
			for (int i = 0 ; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == P) {
						v = i;
						break;
					}
				}
			}
			
			for (int el : arr[v]) {
				if (el == P) continue;
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
