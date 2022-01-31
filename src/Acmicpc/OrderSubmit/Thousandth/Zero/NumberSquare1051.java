package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSquare1051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), res = 1;
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j)-'0';
			}
 		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 1, l1 = 0, l2 = 0; k < Math.min(N, M); k++) {
					l1 = i+k;
					l2 = j+k;
					if (l1 < arr.length && l2 < arr[i].length 
							&& arr[l1][j] == arr[i][j] 
							&& arr[l1][l2] == arr[i][j] 
							&& arr[i][l2] == arr[i][j]) {
						res = Math.max(res, k+1);
					}
				}
			}
		}
		System.out.println(res * res);
		br.close();
	}
}
