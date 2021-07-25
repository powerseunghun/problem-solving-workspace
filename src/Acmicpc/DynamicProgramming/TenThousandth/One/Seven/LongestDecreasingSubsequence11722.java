package Acmicpc.DynamicProgramming.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestDecreasingSubsequence11722 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[] arr = new int[1001];
		int[] lds = new int[1001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			lds[i] = 1;
			for (int j = i-1; j >= 0; j--) {
				if (arr[i] < arr[j] && lds[i] <= lds[j]) {
					lds[i] = lds[j]+1;
				}
 			}
			max = Math.max(max, lds[i]);
		}
		System.out.println(max);
	}
}
