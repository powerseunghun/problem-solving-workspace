package Acmicpc.DynamicProgramming.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestIncreasingSubsequence11055 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] lisSum = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		lisSum[0] = arr[0];
		
		for (int i = 1; i < lisSum.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					lisSum[i] = Math.max(lisSum[i], lisSum[j]+arr[i]);
				}
				else lisSum[i] = Math.max(lisSum[i], arr[i]);
			}
		}
		
		for (int el : lisSum) {
//			System.out.print(el + " ");
			max = Math.max(max, el);
		}
		System.out.println(max);
	}
}
