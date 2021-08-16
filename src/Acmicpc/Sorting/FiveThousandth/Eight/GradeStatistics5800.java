package Acmicpc.Sorting.FiveThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class GradeStatistics5800 {
	static void solution(int num, Integer[] arr, StringBuilder sb) {
		sb.append("Class " + num + "\n");
		int min = 0, max = 0, largeGap = Integer.MIN_VALUE;
		Arrays.sort(arr);
		min = arr[0];
		
		Arrays.sort(arr, Collections.reverseOrder());
		max = arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			largeGap = Math.max(largeGap, Math.abs(arr[i] - arr[i+1]));
		}
		sb.append("Max " + max + ", Min " + min + ", Largest gap " + largeGap + "\n");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int K = Integer.parseInt(br.readLine()), N = 0, min = 0, max = 0;
		Integer[] arr = null;
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new Integer[N];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			solution(i+1, arr, sb);
		}
		System.out.print(sb.toString());
	}
}
