package Acmicpc.BruteForceAlgorithm.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TteokTiger2502 {
	static int[] arr = null;
	static void fiboInit(int A, int B) {
		for (int i = 1; i < arr.length; i++) {
			if (i == 1) arr[i] = A;
			else if (i == 2) arr[i] = B;
			else arr[i] = arr[i-2] + arr[i-1];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int D = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[D+1];

		for (int i = 1;; i++) {
			for (int j = i+1; (i+j) <= K; j++) {
				fiboInit(i, j);
				if (arr[D] == K) {
					System.out.println(i);
					System.out.println(j);
					return;
				}
			}
		}
		
	}
}
