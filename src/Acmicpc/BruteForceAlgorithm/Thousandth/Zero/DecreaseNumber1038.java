package Acmicpc.BruteForceAlgorithm.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecreaseNumber1038 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = new long[1000001];
		int N = Integer.parseInt(br.readLine()), idx = 10;

		for (int i = 0; i < idx; i++) {
			arr[i] = i;
		}
		for (int i = 1; i <= N; i++) {
			long m = arr[i] % 10;
			for (int j = 0; j < m; j++) {
				arr[idx++] = arr[i] * 10 + j;
			}
		}
		// 1022 th -> 987665432
		if (N >= 1023) {
			System.out.println("-1");
			return;
		}
		else System.out.println(arr[N]);
	}
}
