package Acmicpc.Step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinomialCoefficient11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int[][] dpArr = new int[1001][1001];
		
		// 1 faile think range
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i)dpArr[i][j] = 1;
				else {
					dpArr[i][j] = (dpArr[i-1][j-1] + dpArr[i-1][j]) % 10007;
				}
			}
		}
		System.out.println(dpArr[n][k]);
	}
}
