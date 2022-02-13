package Acmicpc.OrderSubmit.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class History1613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), S = 0;
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 0, a = 0, b = 0; i < K; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr[a][b] = 1;
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
		
		S = Integer.parseInt(br.readLine());
		for (int i = 0, a = 0, b = 0; i < S; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			if (arr[a][b] == 1) {
				sb.append("-1\n");
			}
			else {
				if (arr[b][a] == 1) {
					sb.append("1\n");
				}
				else sb.append("0\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
