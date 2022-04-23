package Acmicpc.OrderSubmit.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scale10159 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
		arr = new int[N+1][N+1];
		String tmp = null;
		
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr[a][b] = 1;
//			arr[b][a] = 1;
		}
		
		for (int k = 1; k < arr.length; k++) {
			for (int i = 1; i < arr.length; i++) {
				for (int j = 1; j < arr[i].length; j++) {
					if (arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
				}
			}
		}
		
		for (int i = 1, cnt = 0; i < arr.length; i++, cnt = 0) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i==j) continue;
				if (arr[i][j] == 0 && arr[j][i] == 0) cnt++;
			}
			sb.append(cnt+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
