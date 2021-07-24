package Acmicpc.Implements.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArraySum2167 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = 0, a = 0, b = 0 , c = 0, d = 0, sum = 0;
		int[][] arr = new int[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1]-arr[i-1][j-1] + Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		K = Integer.parseInt(br.readLine());
		for (int i = 0, val = 0; i < K; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			d = Integer.parseInt(tmp.split(" ")[3]);
			
			val = arr[c][d] + arr[a-1][b-1] - arr[a-1][d] - arr[c][b-1];
			System.out.println(val + "\n");
		}
		System.out.print(sb.toString());
	}
}
