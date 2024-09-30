package Acmicpc.As.B2.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friend10864 {
	static boolean[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), r = 0, c = 0;
		arr = new boolean[N][N];
		
		while(M-- > 0) {
			str = br.readLine();
			r = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			arr[r-1][c-1] = true;
			arr[c-1][r-1] = true;
		}
		
		for (int i = 0, cnt = 0; i < arr.length; i++, cnt = 0) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j]) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
