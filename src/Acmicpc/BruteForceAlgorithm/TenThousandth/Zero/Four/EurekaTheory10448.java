package Acmicpc.BruteForceAlgorithm.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EurekaTheory10448 {
	static void init(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (i * (i+1)) / 2;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[] arr = new int[1001];
		boolean[] check = new boolean[1001];
		init(arr);
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				for (int k = 1, val = 0; k < arr.length; k++) {
					val = arr[i] + arr[j] + arr[k];
					if (val > 1000) continue;
					
					check[val] = true;
				}
			}
		}
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			if (check[N]) sb.append("1\n");
			else sb.append("0\n");
		}
		
		System.out.print(sb.toString());
	}
}
