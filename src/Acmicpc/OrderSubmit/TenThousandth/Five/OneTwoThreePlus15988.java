package Acmicpc.OrderSubmit.TenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreePlus15988 {
	static final int mod = 1000000009;
	static void init(long[][] arr) {
		arr[1][1] = 1;
		arr[2][2] = 1;
		for (int i = 1; i <= 3; i++) {
			arr[3][i] = 1;
		}
		for (int i = 4; i < arr.length; i++) {
			arr[i][1] = (arr[i-1][2]+arr[i-1][3]) % mod;
			arr[i][2] = (arr[i-2][1]+arr[i-2][3]) % mod;
			arr[i][3] = (arr[i-3][1]+arr[i-3][2]) % mod;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long[][] arr = new long[100001][4];
		int T = Integer.parseInt(br.readLine());
		init(arr);
		
		long val = 0;
		for (int i = 0, n = 0; i < T; i++) {
			val = 0;
			n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= 3; j++) {
				val += arr[n][j];
			}
			sb.append((val % mod) + "\n"); 
		}
		System.out.print(sb.toString());
		br.close();
	}
}
