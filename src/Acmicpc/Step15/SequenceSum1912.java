package Acmicpc.Step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceSum1912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0;
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] > 0 && arr[i] + arr[i-1] > 0) {
				arr[i] += arr[i-1];
			}
			max = Math.max(arr[i], max);
		}
		System.out.println(max);
	}
}
